/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
/**
 *
 * @author Voke
 */
public class AssignShiftDAO {
    
    private Connection connection;
    
    public AssignShiftDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public ArrayList<String> getShiftIDArray(LocalDate start, LocalDate end) {
        ArrayList<String> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select ShiftID from Shift "
                + "where Date >= '" + start.toString() + "'and Date <= '" + end.toString() + "'";
            ResultSet resultSet = statement.executeQuery(query);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
