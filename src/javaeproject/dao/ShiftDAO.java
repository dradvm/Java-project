/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.connection.*;
import javaeproject.model.*;

/**
 *
 * @author DELL
 */
public class ShiftDAO {

    private Connection connection;
    private final LocalDate dateNow = LocalDate.now();
    
    
    public ShiftDAO() {
        connection = ConnectionDB.getConnection();
    }

    public Shift getByID(String shiftID) {
        String sql = "SELECT * FROM Shift where shiftID = ?";
        Shift shift = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shiftID);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                shift = new Shift();
                setShift(shift, rs);
                return shift;
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return null;
    }

    public ArrayList<Shift> getAllCurrentShift(User user) {
        String sql = "select * from Shift where EmployeeID = ? order by Date";
        ArrayList shiftList = new ArrayList<Shift>();
        Shift shift;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,user.getEmployeeID());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                shift = new Shift();
                setShift(shift, rs);
                shiftList.add(shift);
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return shiftList;
    }
    
    public ArrayList<Shift> getAllDesiredShift(User user) {
        String sql = "select * from Shift where EmployeeID != ? and Date >= ? and Date <= ? order by Date";
        ArrayList shiftList = new ArrayList<Shift>();
        Shift shift;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,user.getEmployeeID());
            statement.setString(2, dateNow.plusDays(2).toString());
            statement.setString(3, dateNow.plusDays(9).toString());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                shift = new Shift();
                setShift(shift, rs);
                shiftList.add(shift);
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return shiftList;
    }
    
    public ArrayList<Shift> getAllDesiredShiftAfterSelect(User user,Shift shift) {
        ArrayList<Shift> shiftList = new ArrayList<Shift>();
        ArrayList<Shift> desiredList = getAllDesiredShift(user);
        for (Shift shiftItem : desiredList) {
            if (checkAvailableToChange(shift, shiftItem) && checkAvailableToChange(shiftItem, shift)) {
                shiftList.add(shiftItem);
            }
        }
        return shiftList;
    }
    
    
    public void add(Shift shift) throws SQLException {
        String sql = "INSERT INTO Shift VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        setStatement(statement, shift);
        statement.executeUpdate();
    }

    public void performChangeShift(Shift shift1, Shift shift2) {
        checkAvailableToChange(shift1, shift2);
        checkAvailableToChange(shift2, shift1);

    }
    
    private boolean checkAvailableToChange(Shift shift1, Shift shift2) {
        boolean varReturn = false;
        try {
            String sql = "";
            boolean check = false;
            if (!(getTypeOfEmployeeAssignToShift(shift1).equals("Receptionist") ^ getTypeOfEmployeeAssignToShift(shift2).equals("Receptionist"))) {
                
                if (shift1.getType().equals("Fulltime") || shift2.getType().equals("Fulltime")) {
                    sql = "select * from shift where EmployeeID = ? and Date = ? and ShiftID != ?";
                    check = true;
                }

                else {
                    sql = "select * from shift where EmployeeID = ? and Date = ? and ShiftID != ? and (Type = ? or Type = 'Fulltime')";
                }
            }
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shift1.getEmployeeID());
            statement.setString(2, shift2.getDate().toString());
            statement.setString(3, shift1.getShiftID());
            if (!check) {
                statement.setString(4, shift2.getType());
            }
            ResultSet rs = statement.executeQuery();
            if (!rs.next()) {
                varReturn = true;
            }
            else {
                varReturn = false;
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return varReturn;
    }
    
    private String getTypeOfEmployeeAssignToShift(Shift shift) {
        String sql = "select Position from Employee where EmployeeID = ?";
        String type = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shift.getEmployeeID());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                type = rs.getString(1);
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return type;
    } 
    
    
    
    public String getEmployeeNameAssignToShift(Shift shift) {
        String sql = "select EmployeeName from Employee where EmployeeID = ?";
        String name = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shift.getEmployeeID());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                name = rs.getString(1);
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return name;
    }
    
    
    private void setShift(Shift shift, ResultSet rs) throws SQLException{
        shift.setShiftID(rs.getString(1));
        shift.setEmployeeID(rs.getString(2));
        shift.setDepartmentID(rs.getString(3));
        shift.setRoomID(rs.getString(4));
        shift.setType(rs.getString(5));
        String[] myDate = rs.getString(6).split("-");
        shift.setDate(LocalDate.of(Integer.parseInt(myDate[0]), Integer.parseInt(myDate[1]), Integer.parseInt(myDate[2])));
    }

    private void setStatement(PreparedStatement statement, Shift shift) throws SQLException {
        statement.setString(1, getNewID());
        statement.setString(2, shift.getEmployeeID());
        statement.setString(3, shift.getDepartmentID());
        statement.setString(4, shift.getRoomID());
        statement.setString(5, shift.getType());
        statement.setString(6, shift.getDate().toString());
    }
    
    public String getNewID() {
        try {
            Statement statement = connection.createStatement();
            String query = "select top 1 ShiftID from [Shift] "
                + "where (select len(ShiftID)) = (select max(len(ShiftID)) from [Shift]) "
                + "order by ShiftID desc";
            ResultSet result = statement.executeQuery(query);
            int maxShiftID = -1;
            while (result.next()) {
                maxShiftID = Integer.parseInt(result.getString(1).split("S")[1]);
            }
            if (maxShiftID != -1) {
                return "S" + (maxShiftID + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean isRoomVailable(Shift shift) {
        boolean result = false;
        try {
            String query;
            PreparedStatement statement;
            if (shift.getType().equals("Fulltime")) {
                query = "select count(*) from [Shift] where "
                    + "RoomID = ? and [Date] = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, shift.getRoomID());
                statement.setString(2, shift.getDate().toString());
            }
            else {
                query = "select count(*) from [Shift] where "
                    + "(Type = ? or Type = 'Fulltime') and RoomID = ? and [Date] = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, shift.getType());
                statement.setString(2, shift.getRoomID());
                statement.setString(3, shift.getDate().toString());
            }
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                if (resultSet.getInt(1) == 0) {
                    result = true;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<Shift> getAssignableShiftList(LocalDate start, LocalDate end) {
        ArrayList<Shift> result = new ArrayList<>();
        try {
            String query = "select * from [Shift] where "
                + "EmployeeID is null and [Date] >= ? and [Date] <= ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, start.toString());
            statement.setString(2, end.toString());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Shift temp = new Shift();
                setShift(temp, resultSet);
                result.add(temp);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void assignShift(String employeeID, String shiftID) throws Exception {
        String query = "update [Shift] "
            + "set EmployeeID = ? "
            + "where ShiftID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, employeeID);
        statement.setString(2, shiftID);
        statement.executeUpdate();
    }
}
