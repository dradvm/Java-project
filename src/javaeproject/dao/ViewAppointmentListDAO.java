<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeproject.connection.ConnectionDB;
import javaeproject.gui.ViewAppointmentList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewAppointmentListDAO {

    /**
     * @param args the command line arguments
     */
        private Connection connection;
        private LocalDate today = LocalDate.now();
    private String todayStr = String.valueOf(today);
    

    
    
        public void showToday () throws SQLException {
        
  
        
    }

        public void deleteAll () throws SQLException {

            
        
    }
        
    public void showAll () throws SQLException {
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            deleteAll();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAppointmentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        String employeeID = "";
        boolean signal = true;
      
        if (1+1 == 2 & signal == true) {
      
        }
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Not found !");
            
        }
        else {
            try {
                showToday();
                showAll();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAppointmentList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }                                        

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeproject.connection.ConnectionDB;
import javaeproject.gui.ViewAppointmentList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewAppointmentListDAO {

    /**
     * @param args the command line arguments
     */
        private Connection connection;
        private LocalDate today = LocalDate.now();
    private String todayStr = String.valueOf(today);
    

    
    
        public void showToday () throws SQLException {
        
  
        
    }

        public void deleteAll () throws SQLException {

            
        
    }
        
    public void showAll () throws SQLException {
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            deleteAll();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAppointmentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        String employeeID = "";
        boolean signal = true;
      
        if (1+1 == 2 & signal == true) {
      
        }
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Not found !");
            
        }
        else {
            try {
                showToday();
                showAll();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAppointmentList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }                                        

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
>>>>>>> 6ea56ac29362407be500cc49fb6f9c92884522ae
