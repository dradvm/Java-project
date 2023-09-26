/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package loc;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SelectPatientGUI extends javax.swing.JPanel {

    /**
     * Creates new form SelectPatientGUI
     */
    public SelectPatientGUI() {
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

        selectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectIDtextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        selectall = new javax.swing.JButton();

        selectButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Enter Patient ID want to view information");

        selectIDtextfield.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        table.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "PatientName", "Gender", "PatientPhone", "PatientAddress", "PatientDoB", "Note"
            }
        ));
        jScrollPane1.setViewportView(table);

        selectall.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        selectall.setText("Select All");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectIDtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectall)
                            .addComponent(selectButton))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectIDtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectall)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        String patientIDToSelect = selectIDtextfield.getText();
        PatientDAO dao = new PatientDAO();
        Patient patient = dao.getPatientByID(patientIDToSelect);

        if (patient == null) {
            JOptionPane.showMessageDialog(this, "Patient with ID " + patientIDToSelect + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Xóa tất cả các hàng hiện có trong bảng

            // Thêm thông tin bệnh nhân vào bảng
            model.addRow(new Object[]{
                patient.getPatientID(),
                patient.getPatientName(),
                patient.getPatientGender(),
                patient.getPatientPhone(),
                patient.getPatientAddress(),
                patient.getPatientDoB(),
                patient.getNote()
            });
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        PatientDAO dao = new PatientDAO();
    List<Patient> patients = dao.getAllPatients();
    
    // Tạo mô hình dữ liệu cho bảng
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    
    // Xóa tất cả các hàng hiện có trong bảng
    model.setRowCount(0);
    
    // Thêm tất cả các bệnh nhân vào mô hình dữ liệu và cập nhật bảng
    for (Patient patient : patients) {
        model.addRow(new Object[]{
            patient.getPatientID(),
            patient.getPatientName(),
            patient.getPatientGender(),
            patient.getPatientPhone(),
            patient.getPatientAddress(),
            patient.getPatientDoB(),
            patient.getNote()
        });
    }
    }//GEN-LAST:event_selectallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectButton;
    private javax.swing.JTextField selectIDtextfield;
    private javax.swing.JButton selectall;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
