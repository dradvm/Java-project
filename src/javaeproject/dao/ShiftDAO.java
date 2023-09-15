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
    
    
    
    public void add(Shift shift) {
        String sql = "INSERT INTO Shift VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            setStatement(statement, shift);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void performChangeShift(Shift shift1, Shift shift2) {
        checkAvailableToChange(shift1, shift2);
        checkAvailableToChange(shift2, shift1);

    }
    
    private void checkAvailableToChange(Shift shift1, Shift shift2) {
        
        try {
            String sql = "";
            boolean check = false;
            if (shift1.getType().equals("Fulltime") || shift2.getType().equals("Fulltime")) {
                sql = "select * from shift where EmployeeID = ? and Date = ? and ShiftID != ?";
                check = true;
            }
            else {
                sql = "select * from shift where EmployeeID = ? and Date = ? and ShiftID != ? and (Type = ? or Type = 'Fulltime')";
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
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
    private void setShift(Shift shift, ResultSet rs) throws SQLException{
        shift.setShiftID(rs.getString(1));
        shift.setEmployeeID(rs.getString(2));
        shift.setDepartmentID(rs.getString(3));
        shift.setRoomID(rs.getString(4));
        String[] myDate = rs.getString(5).split("-");
        shift.setDate(LocalDate.of(Integer.parseInt(myDate[0]), Integer.parseInt(myDate[1]), Integer.parseInt(myDate[2])));
        shift.setType(rs.getString(6));
        shift.setStartTime(rs.getInt(7));
        shift.setEndTime(rs.getInt(8));
    }

    private void setStatement(PreparedStatement statement, Shift shift) throws SQLException {
        statement.setString(1, getNewID());
        statement.setString(2, shift.getEmployeeID());
        statement.setString(3, shift.getDepartmentID());
        statement.setString(4, shift.getRoomID());
        statement.setString(5, shift.getDate().toString());
        statement.setString(6, shift.getType());
        statement.setInt(7, shift.getStartTime());
        statement.setInt(8, shift.getEndTime());
    }
    
    public String getNewID() {
        try {
            Statement statement = connection.createStatement();
            String query = "select top 1 ShiftID "
                + "from [Shift] "
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
}