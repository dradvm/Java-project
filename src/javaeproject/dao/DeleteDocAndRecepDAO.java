/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaeproject.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeproject.connection.ConnectionDB;
import javaeproject.gui.AlterDoctorAndReceptionest;
import javaeproject.model.User;
import javax.swing.JOptionPane;
import javaeproject.*;

/**
 *
 * @author Admin
 */
public class DeleteDocAndRecepDAO {

    /**
     * @param args the command line arguments
     */
     public void updateGender () {
        
 
        
    }
    
    public void updatePosition () {
        
    
        
    }

    public void updateComboboxDepartmentID () throws SQLException {
        
      
        
    }
    
    public void setEditableOfall () {
       
        
    }
    
    public void clearDetail () {
 
    }   
    
    public void getEmployeeDetail(String employeeID) {
        
    }    
    
    public void updateDatabase() throws SQLException {
        
    }
    
    public void checkValidAlteredFields () throws SQLException {    
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure to delete this person ?", "Deletional Confirmation", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Successfully Deleted !");
            updateDatabase();
            clearDetail();  
        } else {
            JOptionPane.showMessageDialog(null, "Confirmation Canceled !");            
        }
           
    }    
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
