/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import javaeproject.connection.ConnectionDB;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author Voke
 */
public class GenerateShiftDAO {
    
    private final Connection connection;
    
    public GenerateShiftDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public String generateShiftID() {
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
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insertShift(String shiftID, String departmentID, String roomID, LocalDate date, String type, int startTime, int endTime) {
        try {
            String query = "insert into [Shift](ShiftID, DepartmentID, RoomID, [Date], [Type], StartTime, EndTime) " 
                + "values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, shiftID);
            statement.setString(2, departmentID);
            statement.setString(3, roomID);
            statement.setString(4, date.toString());
            statement.setString(5, type);
            statement.setInt(6, startTime);
            statement.setInt(7, endTime);
            statement.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
