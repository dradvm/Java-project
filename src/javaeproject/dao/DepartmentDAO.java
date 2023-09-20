/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.Department;
/**
 *
 * @author Voke
 */
public class DepartmentDAO {
    
    private final Connection connection;
    
    public DepartmentDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public ArrayList<Department> getDepartmentList() {
        ArrayList<Department> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from Department";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Department temp = new Department();
                temp.setDepartmentID(resultSet.getString(1));
                temp.setDepartmentName(resultSet.getString(2));
                result.add(temp);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
