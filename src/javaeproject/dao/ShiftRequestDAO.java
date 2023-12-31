/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import javaeproject.connection.*;
import javaeproject.model.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ShiftRequestDAO {

    private Connection connection;
    private final ShiftDAO shiftDAO = new ShiftDAO();
    
    
    private final LocalDate currentDate = LocalDate.now();
    private final LocalDate startOfMonth = currentDate.withDayOfMonth(1);
    private final LocalDate endOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
    public ShiftRequestDAO(Connection connection) {
        this.connection = connection;
    }

    
    
    public ShiftRequestDAO() {
        connection = ConnectionDB.getConnection();
    }

    public ShiftRequest getByID(String requestID) {
        String sql = "SELECT * FROM ChangeRequest where RequestID = ?";
        ShiftRequest shiftRequest = null;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, requestID);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                shiftRequest = new ShiftRequest();
                setShiftRequest(shiftRequest, rs);
                return shiftRequest;
            }
        } catch (SQLException e) {

            System.out.println("Error");
        }
        return null;
    }

    public ArrayList<ShiftRequest> getAllRequestPending(User user) {
        String sql = "select RequestID, ChangeRequest.EmployeeID, CurrentShiftID, DesiredShiftID, Details, RequestDate, Status from ChangeRequest join Employee on ChangeRequest.EmployeeID = Employee.EmployeeID where Status = 'Pending' and Position ";
        if (user.getPosition().equals("Manager")) {
            sql+= "= 'Department Head'";
        }
        else {
            sql+= "!= 'Department Head'";
        }
        sql+=" order by RequestDate";
        ArrayList shiftRequestList = new ArrayList<ShiftRequest>();
        ShiftRequest shiftRequest;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                shiftRequest = new ShiftRequest();
                setShiftRequest(shiftRequest, rs);
                shiftRequestList.add(shiftRequest);
            }

        } catch (SQLException e) {

            System.out.println("Error");
        }
        return shiftRequestList;
    }

    public ArrayList<ShiftRequest> getAllRequestNotPending() {
        String sql = "select * from ChangeRequest where Status != 'Pending'";
        ArrayList shiftRequestList = new ArrayList<ShiftRequest>();
        ShiftRequest shiftRequest;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                shiftRequest = new ShiftRequest();
                setShiftRequest(shiftRequest, rs);
                shiftRequestList.add(shiftRequest);
            }

        } catch (SQLException e) {

            System.out.println("Error");
        }
        return shiftRequestList;
    }
    public ArrayList<ShiftRequest> getAllUserRequest(String employeeID) {
        String sql = "select * from ChangeRequest where EmployeeID = ? order by RequestDate";
        ArrayList shiftRequestList = new ArrayList<ShiftRequest>();
        ShiftRequest shiftRequest;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, employeeID);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                shiftRequest = new ShiftRequest();
                setShiftRequest(shiftRequest, rs);
                shiftRequestList.add(shiftRequest);
            }

        } catch (SQLException e) {

            System.out.println("Error");
        }
        return shiftRequestList;
    }
    
    public void add(ShiftRequest shiftRequest) {
        String sql = "INSERT INTO ChangeRequest VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            setStatement(statement, shiftRequest);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Your change request has been successfully created", "" ,JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JButton("Confirm"),"Error System!! Please try again later", "", JOptionPane.WARNING_MESSAGE);
        }
    }

    public String getNewID() {
        try {
            Statement statement = connection.createStatement();
            String query = "select top 1 RequestID "
                + "from [ChangeRequest] "
                + "where (select len(RequestID)) = (select max(len(RequestID)) from [ChangeRequest]) "
                + "order by RequestID desc";
            ResultSet result = statement.executeQuery(query);
            int maxShiftRequestID = 0;
            while (result.next()) {
                maxShiftRequestID = Integer.parseInt(result.getString(1).split("RQ")[1]);
            }
            return "RQ" + (maxShiftRequestID + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isAlreadyExist(User user, Shift shift1, Shift shift2) {
        String sql = "select * from ChangeRequest where EmployeeID = ? and CurrentShiftID = ? and DesiredShiftID = ? and (RequestDate >= ? and RequestDate <= ?) ";
        boolean varReturn = false;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getEmployeeID());
            statement.setString(2, shift1.getShiftID());
            statement.setString(3, shift2.getShiftID());
            statement.setString(4, startOfMonth.toString());
            statement.setString(5, endOfMonth.toString());

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
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
    
    public boolean isReachedLimit(User user) {
    String sql = "select count(*) as [Count] from ChangeRequest where EmployeeID = ? and Status = 'Approved' and (RequestDate >= ? and RequestDate <= ?)";
        boolean varReturn = false;
        int limit = 1;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getEmployeeID());
            statement.setString(2, startOfMonth.toString());
            statement.setString(3, endOfMonth.toString());
            ResultSet rs = statement.executeQuery();
            rs.next();
            if (rs.getInt(1) == limit) {
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
    
    public String getEmployeeNameOfShiftRequest(String employeeID) {
        String sql = "select EmployeeName from Employee where EmployeeID = ?";
        String name = "";
        boolean varReturn = false;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, employeeID);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                name = rs.getString(1);
            }
            else {
                
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return name;
    }
    public void ApproveRequest(ShiftRequest shiftRequest) {
        String sql = "Update ChangeRequest set Status = 'Approved' where (RequestID = ?) or (CurrentShiftID = ? and DesiredShiftID = ?) and Status = 'Pending' and (RequestDate >= ? and RequestDate <= ?)";
        String sql2 = "Update ChangeRequest set Status = 'Rejected' where ((CurrentShiftID = ?) or (CurrentShiftID = ?)) and RequestID != ? and Status = 'Pending' and (RequestDate >= ? and RequestDate <= ?)";
        String sql3 = "Update ChangeRequest set Status = 'Rejected' where EmployeeID = ? and RequestID != ? and (RequestDate >= ? and RequestDate <= ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shiftRequest.getRequestID());
            statement.setString(2, shiftRequest.getDesiredShiftID());
            statement.setString(3, shiftRequest.getCurrentShiftID());
            statement.setString(4, startOfMonth.toString());
            statement.setString(5, endOfMonth.toString());
            statement.executeUpdate();
            
            PreparedStatement statement2 = connection.prepareStatement(sql2);
            statement2.setString(1, shiftRequest.getCurrentShiftID());
            statement2.setString(2, shiftRequest.getDesiredShiftID());
            statement2.setString(3, shiftRequest.getRequestID());
            statement2.setString(4, startOfMonth.toString());
            statement2.setString(5, endOfMonth.toString());
            statement2.executeUpdate();
            
            PreparedStatement statement3 = connection.prepareStatement(sql3);
            statement3.setString(1, shiftRequest.getEmployeeID());
            statement3.setString(2, shiftRequest.getRequestID());
            statement3.setString(3, startOfMonth.toString());
            statement3.setString(4, endOfMonth.toString());
            statement3.executeUpdate();
            shiftDAO.switchShift(shiftRequest.getCurrentShiftID(), shiftRequest.getDesiredShiftID());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JButton("Confirm"),"Error System!! Please try again later", "", JOptionPane.WARNING_MESSAGE);
        }
    };
    
    public void RejectRequest(ShiftRequest shiftRequest) {
        String sql = "Update ChangeRequest set Status = 'Rejected' where RequestID = ?";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, shiftRequest.getRequestID());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(new JButton("Confirm"),"Rejected shift request", "", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JButton("Confirm"),"Error System!! Please try again later", "", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    
    private void setShiftRequest(ShiftRequest shiftRequest, ResultSet rs) throws SQLException{
        shiftRequest.setRequestID(rs.getString(1));
        shiftRequest.setEmployeeID(rs.getString(2));
        shiftRequest.setCurrentShiftID(rs.getString(3));
        shiftRequest.setDesiredShiftID(rs.getString(4));
        shiftRequest.setDetails(rs.getString(5));
        String[] myDate = rs.getString(6).split("-");
        shiftRequest.setDate(LocalDate.of(Integer.parseInt(myDate[0]), Integer.parseInt(myDate[1]), Integer.parseInt(myDate[2])));
        shiftRequest.setStatus(rs.getString(7));
    }

    private void setStatement(PreparedStatement statement, ShiftRequest shiftRequest) throws SQLException {
        statement.setString(1, getNewID());
        statement.setString(2, shiftRequest.getEmployeeID());
        statement.setString(3, shiftRequest.getCurrentShiftID());
        statement.setString(4, shiftRequest.getDesiredShiftID());
        statement.setString(5, shiftRequest.getDetails());
        statement.setString(6, shiftRequest.getDate().toString());
        statement.setString(7, shiftRequest.getStatus());
    }
}
