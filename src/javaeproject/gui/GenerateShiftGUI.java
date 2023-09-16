package javaeproject.gui;

import java.util.ArrayList;
import javaeproject.dao.DepartmentDAO;
import javaeproject.dao.RoomDAO;
import javaeproject.dao.ShiftDAO;
import javaeproject.model.Department;
import javaeproject.model.Room;
import javaeproject.model.Shift;

public class GenerateShiftGUI extends javax.swing.JPanel {

    private final ShiftDAO shiftDAO = new ShiftDAO();
    private final DepartmentDAO departmentDAO = new DepartmentDAO();
    private final RoomDAO roomDAO = new RoomDAO();
    private final Shift generatedShift = new Shift();
    private final ArrayList<Department> departmentList = departmentDAO.getDepartmentList();
    private final ArrayList<Room> roomList = roomDAO.getRoomList();
    
    public GenerateShiftGUI() {
        initComponents();
        generatedShift.setShiftID(shiftDAO.getNewID());
        for (Department item : departmentList) {
            departmentInput.addItem(item.getDepartmentName());
        }
        for (Room item : roomList) {
            roomIDInput.addItem(item.getRoomID());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        shiftIDLabel = new javax.swing.JLabel();
        shiftIDInput = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        departmentInput = new javax.swing.JComboBox<>();
        roomIDLabel = new javax.swing.JLabel();
        roomIDInput = new javax.swing.JComboBox<>();
        roomTypeLabel = new javax.swing.JLabel();
        roomTypeValue = new javax.swing.JLabel();
        roomSpecialtyLabel = new javax.swing.JLabel();
        roomSpecialtyValue = new javax.swing.JLabel();
        NumberOfPatientsLabel = new javax.swing.JLabel();
        numberOfPatientsValue = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateInput = new javax.swing.JFormattedTextField();
        typeLabel = new javax.swing.JLabel();
        typeInput = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        startTimeInput = new javax.swing.JFormattedTextField();
        endTimeLabel = new javax.swing.JLabel();
        endTimeInput = new javax.swing.JFormattedTextField();
        submitButton = new javax.swing.JButton();

        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(864, 720));

        header.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Shift Generation");
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.setPreferredSize(new java.awt.Dimension(864, 55));

        shiftIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        shiftIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftIDLabel.setText("Shift ID");
        shiftIDLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        shiftIDInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        shiftIDInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftIDInput.setText(shiftDAO.getNewID());
        shiftIDInput.setPreferredSize(new java.awt.Dimension(288, 55));

        departmentLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        departmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departmentLabel.setText("Department");
        departmentLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        departmentInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        departmentInput.setPreferredSize(new java.awt.Dimension(288, 55));
        departmentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentInputActionPerformed(evt);
            }
        });

        roomIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        roomIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomIDLabel.setText("Room ID");
        roomIDLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        roomIDInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roomIDInput.setPreferredSize(new java.awt.Dimension(288, 55));
        roomIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomIDInputActionPerformed(evt);
            }
        });

        roomTypeLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomTypeLabel.setText("Room type");
        roomTypeLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        roomTypeValue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomTypeValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomTypeValue.setPreferredSize(new java.awt.Dimension(288, 55));

        roomSpecialtyLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomSpecialtyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomSpecialtyLabel.setText("Room specialty");
        roomSpecialtyLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        roomSpecialtyValue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomSpecialtyValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomSpecialtyValue.setPreferredSize(new java.awt.Dimension(288, 55));

        NumberOfPatientsLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NumberOfPatientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumberOfPatientsLabel.setText("Number of patients");
        NumberOfPatientsLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        numberOfPatientsValue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numberOfPatientsValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfPatientsValue.setPreferredSize(new java.awt.Dimension(288, 55));

        dateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date");
        dateLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        dateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        dateInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dateInput.setPreferredSize(new java.awt.Dimension(288, 55));
        dateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateInputActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("Type");
        typeLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        typeInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        typeInput.setPreferredSize(new java.awt.Dimension(288, 55));
        typeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeInputActionPerformed(evt);
            }
        });

        startTimeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        startTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startTimeLabel.setText("Starting time");
        startTimeLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        startTimeInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        startTimeInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        startTimeInput.setPreferredSize(new java.awt.Dimension(288, 55));
        startTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeInputActionPerformed(evt);
            }
        });

        endTimeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endTimeLabel.setText("Ending time");
        endTimeLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        endTimeInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        endTimeInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        endTimeInput.setPreferredSize(new java.awt.Dimension(288, 55));
        endTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTimeInputActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setPreferredSize(new java.awt.Dimension(108, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(endTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(endTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(startTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NumberOfPatientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(numberOfPatientsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(roomTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shiftIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomTypeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumberOfPatientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfPatientsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(startTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(endTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(endTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void departmentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentInputActionPerformed
        // TODO add your handling code here:
        generatedShift.setDepartmentID(departmentList.get(departmentInput.getSelectedIndex()).getDepartmentID());
    }//GEN-LAST:event_departmentInputActionPerformed

    private void roomIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomIDInputActionPerformed
        // TODO add your handling code here:
        Room selected = roomList.get(roomIDInput.getSelectedIndex());
        generatedShift.setRoomID(selected.getRoomID());
        roomSpecialtyValue.setText(selected.getRoomSpecialty());
        roomTypeValue.setText(selected.getRoomType());
    }//GEN-LAST:event_roomIDInputActionPerformed

    private void dateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateInputActionPerformed

    private void typeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeInputActionPerformed

    private void startTimeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeInputActionPerformed

    private void endTimeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTimeInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumberOfPatientsLabel;
    private javax.swing.JFormattedTextField dateInput;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> departmentInput;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JFormattedTextField endTimeInput;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel numberOfPatientsValue;
    private javax.swing.JComboBox<String> roomIDInput;
    private javax.swing.JLabel roomIDLabel;
    private javax.swing.JLabel roomSpecialtyLabel;
    private javax.swing.JLabel roomSpecialtyValue;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel roomTypeValue;
    private javax.swing.JLabel shiftIDInput;
    private javax.swing.JLabel shiftIDLabel;
    private javax.swing.JFormattedTextField startTimeInput;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField typeInput;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
