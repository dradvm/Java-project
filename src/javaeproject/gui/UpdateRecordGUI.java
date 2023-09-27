/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javaeproject.dao.HealthRecordDAO;
import javaeproject.model.Patient;
import javaeproject.dao.PatientDAO;

/**
 *
 * @author DELL
 */
public class UpdateRecordGUI extends javax.swing.JPanel {

    /**
     * Creates new form UpdateRecord
     */
    public UpdateRecordGUI() {
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
        jLabel3 = new javax.swing.JLabel();
        recordid = new javax.swing.JTextField();
        showButton = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        problemarea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();

        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 420));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Enter RecordID");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("PatientID");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Create Date");

        recordid.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Patient Name");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Day of Birth");

        gender.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Gender");

        problemarea.setColumns(20);
        problemarea.setRows(5);
        jScrollPane1.setViewportView(problemarea);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Health Record");

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recordid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(showButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(299, 299, 299))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recordid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(updateButton)
                        .addGap(59, 59, 59))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
                                                   
        String recordID = recordid.getText();

    // Sử dụng biến flag để kiểm tra xem đã hiển thị thông báo lỗi chưa
    boolean showError = false;

    if (recordID != null && !recordID.isEmpty()) {
        // Sử dụng HealthRecordDAO để lấy thông tin từ bảng HealthRecord
        HealthRecordDAO healthRecordDAO = new HealthRecordDAO();

        // Lấy thông tin từ bảng HealthRecord, bao gồm cả PatientID và CreateDate
        String patientID = healthRecordDAO.getPatientIDByRecordID(recordID);
        String createDate = healthRecordDAO.getCreateDateByRecordID(recordID);
        String problem = healthRecordDAO.getHealthRecordByRecordID(recordID);

        if (patientID != null) {
            // Hiển thị thông tin từ HealthRecord lên các trường tương ứng
            id.setText(patientID);
            date.setText(createDate);
            problemarea.setText(problem);

            // Sử dụng PatientDAO để lấy thông tin bệnh nhân từ bảng Patient
            PatientDAO patientDAO = new PatientDAO();

            // Lấy thông tin bệnh nhân từ bảng Patient
            Patient patient = patientDAO.getPatientByID(patientID);

            if (patient == null) {
                // Hiển thị thông báo lỗi nếu không tìm thấy thông tin bệnh nhân
                showError = true;
            } else {
                // Hiển thị thông tin bệnh nhân lên các JTextField
                name.setText(patient.getPatientName());
                gender.setText(patient.getPatientGender());
                dob.setText(patient.getPatientDoB().toString());
            }
        } else {
            // Hiển thị thông báo lỗi nếu không tìm thấy thông tin từ HealthRecord
            showError = true;
        }
    } else {
        // Hiển thị thông báo lỗi nếu RecordID trống
        showError = true;
    }

    // Kiểm tra biến showError và hiển thị thông báo lỗi nếu cần
    if (showError) {
        JOptionPane.showMessageDialog(this, "Patient or HealthRecord not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_showButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    String recordID = recordid.getText();
    String problem = problemarea.getText();

    // Kiểm tra xem RecordID và Problem có được nhập hay không
    if (problem.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter Problem to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra xem các trường dữ liệu từ Patient có bị xóa
    if (id.getText().isEmpty() || name.getText().isEmpty() || gender.getText().isEmpty() || dob.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all patient information.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Lấy ngày và giờ hệ thống
    Date currentDate = new Date();

    // Chuyển ngày và giờ hệ thống thành chuỗi theo định dạng yyyy-MM-dd HH:mm:ss
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDate = dateFormat.format(currentDate);

    // Sử dụng HealthRecordDAO để cập nhật thông tin, chỉ cập nhật "problem" và "create date"
    HealthRecordDAO healthRecordDAO = new HealthRecordDAO();
    boolean updated = healthRecordDAO.updateHealthRecord(recordID, problem, formattedDate);

    if (updated) {
        System.out.println("Health record updated successfully.");
        JOptionPane.showMessageDialog(this, "Health record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        System.out.println("Failed to update health record.");
        JOptionPane.showMessageDialog(this, "Failed to update health record.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea problemarea;
    private javax.swing.JTextField recordid;
    private javax.swing.JButton showButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}