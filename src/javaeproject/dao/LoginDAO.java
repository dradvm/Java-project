/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.User;
/**
 *
 * @author Voke
 */
public class LoginDAO {
    
    private final Connection connection;
    
    public LoginDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public boolean validAccount(String username, String password) {
        try {
            Statement statement = connection.createStatement();
            String query = "select count(*) "
                + "from Employee "
                + "where Username = '" + username + "' and [Password] = '" + password + "'";
            ResultSet result = statement.executeQuery(query);
            int count = 0;
            while (result.next()) {
                count = result.getInt(1);
            }
            return count == 1;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public User getUserFromDB(String username, String password) {
        try {
            Statement statement = connection.createStatement();
            String query = "select * "
                + "from Employee "
                + "where Username = '" + username + "' and [Password] = '" + password + "'";
            ResultSet result = statement.executeQuery(query);
            User user = new User();
            while (result.next()) {
                user.setEmployeeID(result.getString(1));
                user.setDepartmentID(result.getString(2));
                user.setEmployeeName(result.getString(3));
                user.setGender(result.getString(4));
                user.setPosition(result.getString(5));
                user.setAddress(result.getString(6));
                user.setEmployeePhone(result.getString(7));
                String[] dateString = result.getString(8).split("-");
                user.setEmployeeDoB(LocalDate.of(Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2])));
                user.setEmail(result.getString(9));
                user.setEmployeeSpecialty(result.getString(10));
                user.setUsername(result.getString(11));
                user.setPassword(result.getString(12));
            }
            return user;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
