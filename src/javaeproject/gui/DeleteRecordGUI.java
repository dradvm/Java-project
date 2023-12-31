/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.sql.Connection;
import javaeproject.connection.ConnectionDB;
import javax.swing.JOptionPane;
import javaeproject.dao.HealthRecordDAO;

/**
 *
 * @author DELL
 */
public class DeleteRecordGUI extends javax.swing.JPanel {
    private Connection connection;
    /**
     * Creates new form DeleteRecord
     */
    public DeleteRecordGUI() {
        initComponents();
        setOpaque(false);
        connection = ConnectionDB.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        deleteID = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 420));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Enter RecordID");

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(deleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(deleteButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       String RecordIDToDelete = deleteID.getText();

    // Kiểm tra xem đã nhập ID bệnh nhân hay chưa
    if (RecordIDToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter Record ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Tạo đối tượng của HealthRecordDAO để thực hiện xóa hồ sơ sức khỏe
    HealthRecordDAO dao = new HealthRecordDAO();

    // Kiểm tra xóa hồ sơ sức khỏe thành công hay không
    boolean deleted = dao.deleteHealthRecord(RecordIDToDelete);
    if (deleted) {
        System.out.println("Health record deleted successfully.");
        JOptionPane.showMessageDialog(this, "Health record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        System.out.println("Failed to delete health record.");
        JOptionPane.showMessageDialog(this, "Failed to delete health record.", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField deleteID;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
