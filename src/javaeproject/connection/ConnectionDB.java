/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ConnectionDB {

    private static String jdbcUrl;
    private static final String username = "sa";
    private static final String password = "12345678";

    private static Connection connection = null;

    static {
        try {
            Scanner scanner = new Scanner(new File("src/javaeproject/connection/config.txt"));
            String serverName = scanner.nextLine().split(" ")[2];
            String port = scanner.nextLine().split(" ")[1];
            jdbcUrl = "jdbc:sqlserver://" + serverName + ":" + port + ";databaseName=RemedySchedule;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        return connection ;
    }
    public static void closeConnection() {
        try {
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
