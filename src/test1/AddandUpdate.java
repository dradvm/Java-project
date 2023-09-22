/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddandUpdate extends javax.swing.JFrame {
//public PatientDAO dao;
    /**
     * Creates new form Add
     */
    public AddandUpdate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDtextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        genderTextfield = new javax.swing.JTextField();
        phoneTextfield = new javax.swing.JTextField();
        addressTextfield = new javax.swing.JTextField();
        dobTextfield = new javax.swing.JTextField();
        noteTextfield = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add new or update patient information");

        jLabel2.setText("Patient ID");

        jLabel3.setText("Patient Name");

        jLabel4.setText("Gender (male or female)");

        jLabel5.setText("Phone");

        jLabel6.setText("Address");

        jLabel7.setText("Day of Birth (YYYY-MM-DD)");

        jLabel8.setText("Note");

        patientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameActionPerformed(evt);
            }
        });

        addButton.setText("Add new patient");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update patient");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back to menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addressTextfield)
                            .addComponent(dobTextfield)
                            .addComponent(noteTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(IDtextfield)
                            .addComponent(patientName)
                            .addComponent(genderTextfield)
                            .addComponent(phoneTextfield)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(backButton)
                        .addGap(78, 78, 78)
                        .addComponent(addButton)
                        .addGap(26, 26, 26)
                        .addComponent(updateButton)))
                .addGap(16, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(genderTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(phoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(addressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dobTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(noteTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        PatientDAO dao = new PatientDAO();
        Patient patient = new Patient();
     
    
    
    patient.setPatientID(IDtextfield.getText());
    patient.setPatientName(patientName.getText());
    patient.setpatientGender(genderTextfield.getText());
    patient.setpatientPhone(phoneTextfield.getText());
    patient.setpatientAddress(addressTextfield.getText());
    // Lấy giá trị từ JTextField dưới dạng chuỗi
String dobString = dobTextfield.getText();

// Chuyển đổi chuỗi thành kiểu dữ liệu Date
try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
    Date dob = dateFormat.parse(dobString);
    
    // Gán giá trị Date vào thuộc tính của đối tượng Patient
    patient.setPatientDoB(dob);
} catch (ParseException e) {
    // Xử lý lỗi nếu chuỗi không hợp lệ hoặc không thể chuyển đổi thành Date
    e.printStackTrace();
}

    patient.setNote(noteTextfield.getText());

    
    boolean added = dao.addPatient(patient);
    if (added) {
        System.out.println("Patient added successfully.");
    } else {
        System.out.println("Failed to add patient.");
    }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    PatientDAO dao = new PatientDAO();
    Patient patient = new Patient();

    patient.setPatientID(IDtextfield.getText());
    patient.setPatientName(patientName.getText());
    patient.setpatientGender(genderTextfield.getText());
    patient.setpatientPhone(phoneTextfield.getText());
    patient.setpatientAddress(addressTextfield.getText());

    // Lấy giá trị từ JTextField dưới dạng chuỗi
    String dobString = dobTextfield.getText();

    // Chuyển đổi chuỗi thành kiểu dữ liệu Date
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
        Date dob = dateFormat.parse(dobString);

        // Gán giá trị Date vào thuộc tính của đối tượng Patient
        patient.setPatientDoB(dob);
    } catch (ParseException e) {
        // Xử lý lỗi nếu chuỗi không hợp lệ hoặc không thể chuyển đổi thành Date
        e.printStackTrace();
    }

    patient.setNote(noteTextfield.getText());

    // Kiểm tra xem bệnh nhân đã tồn tại hay chưa
    boolean patientExists = dao.isPatientExist(patient.getPatientID());

    if (patientExists) {
        // Thực hiện cập nhật bệnh nhân bằng cách gọi phương thức updatePatient trong dao
        boolean updated = dao.updatePatient(patient);
        if (updated) {
            System.out.println("Patient updated successfully.");
            JOptionPane.showMessageDialog(this, "Patient updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Failed to update patient.");
            JOptionPane.showMessageDialog(this, "Failed to update patient.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        System.out.println("Patient with ID " + patient.getPatientID() + " does not exist.");
        JOptionPane.showMessageDialog(this, "Patient with ID " + patient.getPatientID() + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new JFramePatient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddandUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddandUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddandUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddandUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddandUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDtextfield;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextfield;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField dobTextfield;
    private javax.swing.JTextField genderTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField noteTextfield;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField phoneTextfield;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
