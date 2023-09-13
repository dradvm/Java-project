/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.util.ArrayList;
import javaeproject.connection.*;
import javaeproject.model.*;

/**
 *
 * @author DELL
 */
public class ShiftRequestDAO {

    private Connection connection;

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

    public ArrayList<ShiftRequest> getAllRequestPending() {
        String sql = "select * from ChangeRequest where Status = 'Pending'";
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
    public ArrayList<ShiftRequest> getAllCurrentRequest(String employeeID) {
        String sql = "select * from ChangeRequest where EmployeeID = ?";
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
        String sql = "INSERT INTO ChangeRequest VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            setStatement(statement, shiftRequest);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    private String getNewID() {
        String sql = "select top 1 * from ChangeRequest order by RequestID desc";
        String newID = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String temp = rs.getString(1).split("RQ")[1];
                newID = String.format("%02d", Integer.parseInt(temp) + 1);
            }
        } catch (SQLException e) {

        }
        return newID;
    }

    private void setShiftRequest(ShiftRequest shiftRequest, ResultSet rs) throws SQLException{
        shiftRequest.setRequestID(rs.getString(1));
        shiftRequest.setEmployeeID(rs.getString(2));
        shiftRequest.setCurrentShiftID(rs.getString(3));
        shiftRequest.setDesiredShiftID(rs.getString(4));
        shiftRequest.setDetails(rs.getString(5));
        shiftRequest.setStatus(rs.getString(6));
    }

    private void setStatement(PreparedStatement statement, ShiftRequest shiftRequest) throws SQLException {
        statement.setString(1, getNewID());
        statement.setString(2, shiftRequest.getEmployeeID());
        statement.setString(3, shiftRequest.getCurrentShiftID());
        statement.setString(4, shiftRequest.getDesiredShiftID());
        statement.setString(5, shiftRequest.getDetails());
        statement.setString(6, shiftRequest.getStatus());
    }
}
