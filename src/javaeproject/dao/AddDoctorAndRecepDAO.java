/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.User;

/**
 *
 * @author Admin
 */
public class AddDoctorAndRecepDAO {

    /**
     * @param args the command line arguments
     */

    /**
     * Creates new form AddDoctorAndReceptionestGUI
     */
    private Connection connection;
    private final LocalDate dateNow = LocalDate.now();

       
    public void updateComboboxDepartmentID () {
        
    }
    
    public void updateGender () {
        
       
        
    }
    
    public void updatePosition () {
        
    
        
    }
    
    public void updateDatabaseAddDoc () throws SQLException {
        
        //NewId
        String newId = null;        
            Statement statement = connection.createStatement();
            String query = "select top 1 EmployeeID from [Employee] "
                + "where (select len(EmployeeID)) = (select max(len(EmployeeID)) from [Employee]) "
                + "order by EmployeeID desc";
            ResultSet result = statement.executeQuery(query);
            int maxShiftID = -1;
            while (result.next()) {
                maxShiftID = Integer.parseInt(result.getString(1).split("E")[1]);
            }
            if (maxShiftID != -1) {
                newId = "E" + (maxShiftID + 1);
            }
        
        
        //SettmpShif
        User tmpS = new User();
        String query1 = "Insert into Employee values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement1 = connection.prepareStatement(query1);  
        
        //Set

        
        statement1.setString(1, tmpS.getEmployeeID());
        statement1.setString(2, tmpS.getDepartmentID());
        statement1.setString(3, tmpS.getEmployeeName());
        statement1.setString(4, tmpS.getGender());
        statement1.setString(5, tmpS.getPosition());
        statement1.setString(6, tmpS.getAddress());
        statement1.setString(7, tmpS.getEmployeePhone());
        statement1.setString(8, tmpS.getEmployeeDoB().toString());
        statement1.setString(9, tmpS.getEmail());
        statement1.setString(10, tmpS.getEmployeeSpecialty());
        statement1.setString(11, tmpS.getUsername());
        statement1.setString(12, tmpS.getPassword());
        
        statement1.executeUpdate();
    }
    
    public void clearAddDocAndRecForm () {
        

        
    }
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
