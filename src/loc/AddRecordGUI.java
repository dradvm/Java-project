/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package loc;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class AddRecordGUI extends javax.swing.JPanel {

    /**
     * Creates new form AddRecord
     */
    public AddRecordGUI() {
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

        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        showButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        addNew = new javax.swing.JButton();
        recordid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        old = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 420));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Patient ID");

        id.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        showButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        showButton.setText("Show Information");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Day of Birth");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Gender");

        name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        dob.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        gender.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        recordArea.setColumns(20);
        recordArea.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        recordArea.setRows(5);
        jScrollPane1.setViewportView(recordArea);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Enter Health Record");

        addNew.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addNew.setText("Add new");
        addNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("RecordID");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Old Record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addNew)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(recordid, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel1))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(old, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addComponent(showButton))
                            .addComponent(jLabel5))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recordid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(addNew))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        String patientID = id.getText();

if (patientID != null && !patientID.isEmpty()) {
    // Truy vấn thông tin bệnh nhân từ bảng Patient
    PatientDAO patientDAO = new PatientDAO();
    Patient patient = patientDAO.getPatientByID(patientID);
    System.out.println("Patient ID: " + patientID);

    if (patient != null) {
        // Hiển thị thông tin bệnh nhân lên các JTextField
        name.setText(patient.getPatientName());
        gender.setText(patient.getPatientGender());
        dob.setText(patient.getPatientDoB().toString());

        // Truy vấn và đếm số lượng bản ghi liên quan đến bệnh nhân này từ bảng HealthRecord
        HealthRecordDAO healthRecordDAO = new HealthRecordDAO();

        // Sử dụng một luồng khác để truy vấn cơ sở dữ liệu
        SwingUtilities.invokeLater(() -> {
            int recordCount = healthRecordDAO.countOldRecordsByPatientID(patientID);
            old.setText(String.valueOf(recordCount));
        });
    } else {
        // Nếu không tìm thấy bệnh nhân, hiển thị thông báo lỗi
        JOptionPane.showMessageDialog(this, "Patient with ID " + patientID + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    // Xử lý trường hợp patientID không hợp lệ (rỗng hoặc null)
    JOptionPane.showMessageDialog(this, "Invalid Patient ID.", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_showButtonActionPerformed

    private void addNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewActionPerformed
        String patientID = id.getText(); // Lấy PatientID từ trường nhập liệu ở bước 1
        String recordID = recordid.getText(); // Lấy RecordID từ trường nhập liệu
        String problem = recordArea.getText(); // Lấy Problem từ trường nhập liệu

        // Kiểm tra xem các trường đã được nhập đầy đủ chưa
        if (patientID.isEmpty() || recordID.isEmpty() || problem.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra xem recordID đã tồn tại hay chưa
        HealthRecordDAO healthRecordDAO = new HealthRecordDAO();
        if (healthRecordDAO.checkRecordIDExists(recordID)) {
            JOptionPane.showMessageDialog(this, "Record with RecordID " + recordID + " already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thực hiện thêm mới bản ghi vào bảng HealthRecord
        boolean success = healthRecordDAO.addHealthRecord(recordID, patientID, problem);

        if (success) {
            JOptionPane.showMessageDialog(this, "Record added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Xóa dữ liệu trường nhập liệu để chuẩn bị cho thêm mới tiếp theo (nếu cần)
            recordid.setText("");
            recordArea.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNew;
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
    private javax.swing.JTextField old;
    private javax.swing.JTextArea recordArea;
    private javax.swing.JTextField recordid;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}
