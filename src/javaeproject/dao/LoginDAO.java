package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.User;

public class LoginDAO {
    
    private final Connection connection;
    
    public LoginDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public boolean validAccount(String username, String password) {
        try {
            String query = "select count(*) from Employee "
                + "where Username = ? collate SQL_Latin1_General_CP1_CS_AS "
                + "and convert(varchar(50), decryptbypassphrase('remedy', [Password])) = ? collate SQL_Latin1_General_CP1_CS_AS";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
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
            String query = "select * from Employee "
                + "where Username = ? collate SQL_Latin1_General_CP1_CS_AS "
                + "and convert(varchar(50), decryptbypassphrase('remedy', [Password])) = ? collate SQL_Latin1_General_CP1_CS_AS";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
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
                user.setUsername(username);
                user.setPassword(password);
            }
            return user;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
