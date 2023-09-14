/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import javaeproject.connection.ConnectionDB;
import java.sql.*;
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
}
