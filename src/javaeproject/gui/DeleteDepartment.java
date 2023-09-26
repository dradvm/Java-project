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
public class DeleteDepartment extends javax.swing.JPanel {

    /**
     * Creates new form DeleteDepartment
     */
    private Connection connection;
    private final LocalDate dateNow = LocalDate.now();  
    private String oldID;
    private String oldName;
    
    public DeleteDepartment() {
        initComponents();
        connection = ConnectionDB.getConnection();  
        setEditableOfall();
                
    }

    public void deleteAll () throws SQLException {

            DefaultTableModel modeltable1 = (DefaultTableModel)jTable1.getModel();
            modeltable1.getDataVector().removeAllElements();
            
        
    } 

    public void showAll () throws SQLException {
    
        DefaultTableModel modeltable1 = (DefaultTableModel)jTable1.getModel();
        modeltable1.addRow(new Object[]{oldID, oldName});

    }     
    
    public void setEditableOfall () {
        jTextField1.setEditable(false);   
    }   
    public void clearDetail () {
        
        jTextField1.setText("");  
        jTextField2.setText("");
        
    }
       public void getEmployeeDetail(String DepartmentID) {
        try {         
            String query = "Select * From Department where DepartmentID = '" + DepartmentID +"'";
            System.out.println(query);
            PreparedStatement statement = connection.prepareStatement(query);        
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
             
               
                jTextField1.setText(rs.getString("DepartmentName"));
  
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(AlterDoctorAndReceptionest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateDatabase() throws SQLException {
        Department tmpS = new Department();
        String query1 = "Delete From Department Where DepartmentID = '" + jTextField2.getText() + "'";
        PreparedStatement statement1 = connection.prepareStatement(query1);        
        statement1.executeUpdate();
    }     
    public void checkValidAlteredFields () throws SQLException {    
        if (jTextField1.getText().trim().isEmpty()) {                        
            JOptionPane.showMessageDialog(null, "There is nothing to Delete, please find a department instead !");            
        }
        else { boolean shiftValid = true, appointValid = true;
            String query = "Select * From Shift";
            System.out.println(query);
            PreparedStatement statement = connection.prepareStatement(query);        
            ResultSet rs = statement.executeQuery();    
            
            String query1 = "Select * From Employee";
            System.out.println(query1);
            PreparedStatement statement1 = connection.prepareStatement(query1);        
            ResultSet rs1 = statement1.executeQuery();               
        
            while (rs.next()) {
                
                if (jTextField2.getText().trim().equals(rs.getString("DepartmentID"))) {
                    
                    shiftValid = false;
                    break;
                    
                }
                
            }
            
            while (rs1.next()) {
                
                if (jTextField2.getText().trim().equals(rs1.getString("DepartmentID"))) {
                    
                    appointValid = false;
                    break;
                }
                
            }
            
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure to delete this department ?", "Deletional Confirmation", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION && shiftValid == true && appointValid == true) {
            JOptionPane.showMessageDialog(null, "Successfully Deleted !");
            oldName = jTextField1.getText();
            oldID = jTextField2.getText();
            updateDatabase();
            clearDetail();  
        } else if (reply == JOptionPane.YES_OPTION && shiftValid == false && appointValid == true){
            JOptionPane.showMessageDialog(null, "Can not delete this one because it is being assigned to at least a shift!");            
        }
        else if (reply == JOptionPane.YES_OPTION && shiftValid == true && appointValid == false){
            JOptionPane.showMessageDialog(null, "Can not delete this one because it is being assigned to at least an employee!");            
        }  
        else if (reply == JOptionPane.YES_OPTION && shiftValid == false && appointValid == false){
            JOptionPane.showMessageDialog(null, "Can not delete this one because it is being assigned by both at least a shift and at least an employee!"); 
        }
        else {
            JOptionPane.showMessageDialog(null, "Confirming Delete Canceled");             
        }  }        
       
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
        jLabel12.setText("Delete Department");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DepartmentID");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Delete");
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
        jLabel13.setText("Detail of Department");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("The most recently Deleted Department");

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
                .addGap(565, 565, 565)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(251, 251, 251)))
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(476, 476, 476))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGap(396, 396, 396))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
            Logger.getLogger(DeleteDoctorAndReceptionest.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
