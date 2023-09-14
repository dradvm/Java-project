/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.*;
import javaeproject.connection.ConnectionDB;
/**
 *
 * @author Voke
 */
public class LoginLogoutDAO {
    
    private final Connection connection;
    
    public LoginLogoutDAO() {
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
    
    public String getPositionFromDB(String username, String password) {
        try {
            Statement statement = connection.createStatement();
            String query = "select Position "
                + "from Employee "
                + "where Username = '" + username + "' and [Password] = '" + password + "'";
            ResultSet result = statement.executeQuery(query);
            String position = null;
            while (result.next()) {
                position = result.getString(1);
            }
            return position;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
