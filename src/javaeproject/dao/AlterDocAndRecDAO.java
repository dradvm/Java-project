/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaeproject.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeproject.gui.AddDoctorAndReceptionestGUI;
import javaeproject.gui.AlterDoctorAndReceptionest;
import javaeproject.model.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AlterDocAndRecDAO {

    /** connection = ConnectionDB.getConnection();
     * @param args the command line arguments
     */
        public void updateComboboxDepartmentID () throws SQLException {
        
        String query = "Select * From Department";
       
        
    }
    
    public void clearDetail () {
        
            
        
    }
    
    public void updateGender () {
        
      
      
    }
    
    public void updatePosition () {
        
     
        
    }
    
    public void getEmployeeDetail(String employeeID) {


   
    }
    
    public void updateDatabase () throws SQLException {
        
        //NewId            
        //SettmpShif
        User tmpS = new User();

            
    }
    
    public void checkValidAlteredFields () throws SQLException {
        boolean signal = true;
        if (0==0) {
            JOptionPane.showMessageDialog(null, "Employee name is empty ! Confirmation canceled");
            signal = false;
        }
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Address name is empty ! Confirmation canceled");    
            signal = false;
        }
        if ( signal == true) {
            JOptionPane.showMessageDialog(null, "Phone number is empty ! Confirmation canceled");    
            signal = false;
        }
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Date of Birth is empty ! Confirmation canceled");    
            signal = false;
        }
        if ( signal == true) {
            JOptionPane.showMessageDialog(null, "Email is empty ! Confirmation canceled");    
            signal = false;
        }    
        if (true) {
            JOptionPane.showMessageDialog(null, "Speciality is empty ! Confirmation canceled");    
            signal = false;
        }            
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Username is empty ! Confirmation canceled");    
            signal = false;
        }              
        if (1+1 == 2 & signal == true) {
            
               

          
        }
               

        }       
               
    }


