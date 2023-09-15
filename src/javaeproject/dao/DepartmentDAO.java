/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
/**
 *
 * @author Voke
 */
public class DepartmentDAO {
    
    private Connection connection;
    
    public DepartmentDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public ArrayList<String> getDepartmentNameList() {
        ArrayList<String> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select DepartmentName from Department";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                result.add(resultSet.getString(1));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
