/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javaeproject.model.Patient;
import javaeproject.dao.PatientDAO;

/**
 *
 * @author DELL
 */
public class AddAndUpdateGUI extends javax.swing.JPanel {

    private Connection connection;
    public AddAndUpdateGUI() {
        initComponents();
        setOpaque(false);
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
        patientNameTextfield = new javax.swing.JTextField();
        genderTextfield = new javax.swing.JTextField();
        phoneTextfield = new javax.swing.JTextField();
        addressTextfield = new javax.swing.JTextField();
        dobTextfield = new javax.swing.JTextField();
        noteTextfield = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        showbutton = new javax.swing.JButton();

        jLabel1.setText("Add new or update patient information");

        jLabel2.setText("Patient ID");

        jLabel3.setText("Patient Name");

        jLabel4.setText("Gender (male or female)");

        jLabel5.setText("Phone");

        jLabel6.setText("Address");

        jLabel7.setText("Day of Birth (YYYY-MM-DD)");

        jLabel8.setText("Note");

        patientNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTextfieldActionPerformed(evt);
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

        showbutton.setText("Show");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
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
                            .addComponent(patientNameTextfield)
                            .addComponent(genderTextfield)
                            .addComponent(phoneTextfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(addButton)
                        .addGap(26, 26, 26)
                        .addComponent(updateButton)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(patientNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(addButton))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTextfieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    PatientDAO dao = new PatientDAO();
    Patient patient = new Patient();

    String patientID = IDtextfield.getText();
    String patientName = patientNameTextfield.getText();
    String gender = genderTextfield.getText();
    String phone = phoneTextfield.getText();
    String address = addressTextfield.getText();
    String dobString = dobTextfield.getText();

    // Kiểm tra xem các trường bắt buộc đã được điền hay chưa
    if (patientID.isEmpty() || patientName.isEmpty() || gender.isEmpty() || phone.isEmpty() || address.isEmpty() || dobString.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Lấy giá trị từ JTextField dưới dạng chuỗi
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        Date dob = dateFormat.parse(dobString);

        // Gán giá trị vào thuộc tính của đối tượng Patient
        patient.setPatientID(patientID);
        patient.setPatientName(patientName);
        patient.setpatientGender(gender);
        patient.setpatientPhone(phone);
        patient.setpatientAddress(address);
        patient.setPatientDoB(dob);
        patient.setNote(noteTextfield.getText());

        // Kiểm tra xem bệnh nhân đã tồn tại hay chưa
        boolean patientExists = dao.isPatientExist(patient.getPatientID());

        if (patientExists) {
            System.out.println("Patient with ID " + patient.getPatientID() + " already exists.");
            JOptionPane.showMessageDialog(this, "Patient with ID " + patient.getPatientID() + " already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Thực hiện thêm bệnh nhân bằng cách gọi phương thức addPatient trong dao
            boolean added = dao.addPatient(patient);
            if (added) {
                System.out.println("Patient added successfully.");
                JOptionPane.showMessageDialog(this, "Patient added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed to add patient.");
                JOptionPane.showMessageDialog(this, "Failed to add patient.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (ParseException e) {
        // Xử lý lỗi nếu chuỗi không hợp lệ hoặc không thể chuyển đổi thành Date
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    PatientDAO dao = new PatientDAO();
    Patient patient = new Patient();

    String patientID = IDtextfield.getText();
    String patientName = patientNameTextfield.getText();
    String gender = genderTextfield.getText();
    String phone = phoneTextfield.getText();
    String address = addressTextfield.getText();
    String dobString = dobTextfield.getText();

    // Kiểm tra xem các trường bắt buộc đã được điền hay chưa
    if (patientID.isEmpty() || patientName.isEmpty() || gender.isEmpty() || phone.isEmpty() || address.isEmpty() || dobString.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Dừng việc thực hiện phương thức nếu có trường bắt buộc trống
    }

    // Lấy giá trị từ JTextField dưới dạng chuỗi
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        Date dob = dateFormat.parse(dobString);

        // Gán giá trị vào thuộc tính của đối tượng Patient
        patient.setPatientID(patientID);
        patient.setPatientName(patientName);
        patient.setpatientGender(gender);
        patient.setpatientPhone(phone);
        patient.setpatientAddress(address);
        patient.setPatientDoB(dob);
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
    } catch (ParseException e) {
        // Xử lý lỗi nếu chuỗi không hợp lệ hoặc không thể chuyển đổi thành Date
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
    String patientIDToShow = IDtextfield.getText();
    PatientDAO dao = new PatientDAO();
    Patient patient = dao.getPatientByID(patientIDToShow);

    if (patient == null) {
        JOptionPane.showMessageDialog(this, "Patient with ID " + patientIDToShow + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Hiển thị thông tin bệnh nhân lên các JTextField tương ứng
        patientNameTextfield.setText(patient.getPatientName());
        genderTextfield.setText(patient.getPatientGender());
        phoneTextfield.setText(patient.getPatientPhone());
        addressTextfield.setText(patient.getPatientAddress());

        // Chuyển đổi ngày tháng từ kiểu Date sang kiểu String và hiển thị trên JTextField
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dobTextfield.setText(dateFormat.format(patient.getPatientDoB()));

        noteTextfield.setText(patient.getNote());
    }
    }//GEN-LAST:event_showbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDtextfield;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextfield;
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
    private javax.swing.JTextField patientNameTextfield;
    private javax.swing.JTextField phoneTextfield;
    private javax.swing.JButton showbutton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
