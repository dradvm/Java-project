/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class ConnectionDB {

    private static final String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=northwind;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa";
    private static final String password = "12345678";

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection ;
    }
}
