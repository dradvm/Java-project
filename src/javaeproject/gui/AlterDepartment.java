/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.Department;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class AlterDepartment extends javax.swing.JPanel {

    /**
     * Creates new form AlterDepartment
     */
    private Connection connection;
    private final LocalDate dateNow = LocalDate.now();
    private String oldusername = "";
   
    
    public AlterDepartment() {
        initComponents();            
        connection = ConnectionDB.getConnection();  
 
    }
    
    public void deleteAll () throws SQLException {

            DefaultTableModel modeltable1 = (DefaultTableModel)jTable1.getModel();
            modeltable1.getDataVector().removeAllElements();
            
        
    } 

    public void showAll () throws SQLException {
        String query = "Select * From Department where DepartmentID = '" + jTextField2.getText().trim() + "'";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();        
        DefaultTableModel modeltable1 = (DefaultTableModel)jTable1.getModel();
        while (rs.next()) {
            
            modeltable1.addRow(new Object[]{rs.getString("DepartmentID"), rs.getString("DepartmentName")});
            
        }
    }     
    
    public void clearDetail () {
        
        jTextField1.setText("");     
        
    }
        
   public void getEmployeeDetail(String DepartmentID) {
        try {         
            String query = "Select * From Department where DepartmentID = '" + DepartmentID +"'";
            System.out.println(query);
            PreparedStatement statement = connection.prepareStatement(query);        
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
             
               
                jTextField1.setText(rs.getString("DepartmentName"));

                oldusername = rs.getString("DepartmentName");
  
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(AlterDoctorAndReceptionest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
    public void updateDatabase () throws SQLException {
        
        //NewId     
        
        //SettmpShif
        Department tmpS = new Department();
        String query1 = "Update Department Set DepartmentName = ? Where DepartmentID = '" + jTextField2.getText() + "'";
        PreparedStatement statement1 = connection.prepareStatement(query1);  
        

        tmpS.setDepartmentName(jTextField1.getText().trim());
        statement1.setString(1, tmpS.getDepartmentName());


        
        statement1.executeUpdate();
            
    }
    
    public void checkValidAlteredFields () throws SQLException {

        boolean signal = true;
        if (jTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DepartmentName is empty ! Confirmation canceled");
            signal = false;
        }
        if (1+1 == 2 && signal == true) {
            try {
                String query = "Select * From Department";
                boolean loopSignal = true;
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet rs = statement.executeQuery();
                while (rs.next() && loopSignal == true) {
                    if(jTextField1.getText().trim().equals(rs.getString("DepartmentName")) && jTextField1.getText().trim().equals(oldusername)) {
                        
                        signal = true;
                        loopSignal = false;                                              
                    }
                    else {
                        loopSignal = true;
                    }
                    if (loopSignal == false) {
                        break;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(AddDoctorAndReceptionestGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (1+1 == 2 && signal == true) {
            try {
                String query = "Select * From Department";
                boolean loopSignal = true;
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet rs = statement.executeQuery();
                while (rs.next() && loopSignal == true) {
                    if(jTextField1.getText().trim().equals(rs.getString("DepartmentName")) && !(jTextField1.getText().trim().equals(oldusername))) {
                        JOptionPane.showMessageDialog(null, "DepartmentName is taken, enter different DepartmentName please ! Confirmation canceled"); 
                        signal = false;
                        loopSignal = false;                                              
                    }
                    else {
                        loopSignal = true;
                    }
                    if (loopSignal == false) {
                        break;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(AddDoctorAndReceptionestGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }          
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Altered successfully !");    
            updateDatabase();
            clearDetail();
        }          
    }
               

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Alter Department");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DepartmentID");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Department Name");

        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Edit Department here");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("The most recently Altered Department");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DepartmentID", "DepartmentName"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(390, 390, 390))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(474, 474, 474))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(475, 475, 475))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            checkValidAlteredFields();
            deleteAll();
            showAll();
        } catch (SQLException ex) {
            Logger.getLogger(AlterDoctorAndReceptionest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String DepartmentID = "";
        boolean signal = true;
        if (jTextField2.getText().trim().isEmpty() && signal == true) {
            JOptionPane.showMessageDialog(null, "DepartmentID is empty ! Found Nothing");    
            signal = false;
        }  
        if (1+1 == 2 & signal == true) {
            try {             
                boolean loopSignal = true;
                String query = "Select * From Department";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet rs = statement.executeQuery();
                while (rs.next() && loopSignal == true) {
                    if(jTextField2.getText().trim().equals(rs.getString("DepartmentID"))) {
                        JOptionPane.showMessageDialog(null, "DepartmentID successfully found !"); 
                        DepartmentID = rs.getString("DepartmentID");
                        signal = false;
                        loopSignal = false;                                              
                    }
                    else {
                        loopSignal = true;
                    }
                    if (loopSignal == false) {
                        break;
                    }
                }                                
            } 
            catch (SQLException ex) {
                Logger.getLogger(AddDoctorAndReceptionestGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (signal == true) {
            JOptionPane.showMessageDialog(null, "Not found !"); 
            clearDetail ();
        }
        else {
            getEmployeeDetail(DepartmentID);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
