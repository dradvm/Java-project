package javaeproject.gui;

import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.dao.DepartmentDAO;
import javaeproject.dao.RoomDAO;
import javaeproject.dao.ShiftDAO;
import javaeproject.dao.ShiftTypeDAO;
import javaeproject.model.Department;
import javaeproject.model.Room;
import javaeproject.model.Shift;
import javaeproject.model.ShiftType;

public class GenerateShiftGUI extends javax.swing.JPanel {

    private final ShiftDAO shiftDAO = new ShiftDAO();
    private final DepartmentDAO departmentDAO = new DepartmentDAO();
    private final RoomDAO roomDAO = new RoomDAO();
    private final ShiftTypeDAO shiftTypeDAO = new ShiftTypeDAO();
    private Shift generatedShift = new Shift();
    private ArrayList<Department> departmentList = departmentDAO.getDepartmentList();
    private ArrayList<Room> roomList = roomDAO.getRoomList();
    private ArrayList<ShiftType> typeList = shiftTypeDAO.getTypeList();
    
    public GenerateShiftGUI() {
        initComponents();
        for (Department item : departmentList) {
            departmentInput.addItem(item.getDepartmentName());
        }
        for (Room item : roomList) {
            roomIDInput.addItem(item.getRoomID());
        }
        for (ShiftType item : typeList) {
            typeInput.addItem(item.getType());
        }
        initLogic();
    }
    
    public void initLogic() {        
        generatedShift = new Shift();
        generatedShift.setShiftID(shiftDAO.getNewID());
        generatedShift.setEmployeeID(null);
        try {
            departmentInput.setSelectedIndex(0);
            generatedShift.setDepartmentID(departmentList.get(0).getDepartmentID());
            roomIDInput.setSelectedIndex(0);
            generatedShift.setRoomID(roomList.get(0).getRoomID());
            roomTypeValue.setText(roomList.get(0).getRoomType());
            roomSpecialtyValue.setText(roomList.get(0).getRoomSpecialty());
            numberOfPatientsValue.setText(roomList.get(0).getNumberOfPatients() + "");
            typeInput.setSelectedIndex(0);
            generatedShift.setType(typeList.get(0).getType());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        generatedShift.setDate(null);
        dateInput.setText("");
    }
    
    private int validateShift() {
        if (generatedShift.getDate() == null) {
            return -1;
        }
        if (generatedShift.getDate().isEqual(LocalDate.now()) || generatedShift.getDate().isBefore(LocalDate.now())) {
            return -1;
        }
        return 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorDialog = new javax.swing.JDialog();
        errorConfirmButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        successDialog = new javax.swing.JDialog();
        successConfirmButton = new javax.swing.JButton();
        successMessage = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
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
        typeInput = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();

        errorDialog.setTitle("Error");
        errorDialog.setResizable(false);
        errorDialog.setSize(new java.awt.Dimension(360, 240));

        errorConfirmButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorConfirmButton.setText("OK");
        errorConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorConfirmButton.setPreferredSize(new java.awt.Dimension(108, 36));
        errorConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorConfirmButtonActionPerformed(evt);
            }
        });

        errorMessage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Error message");
        errorMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorMessage.setPreferredSize(new java.awt.Dimension(360, 160));

        javax.swing.GroupLayout errorDialogLayout = new javax.swing.GroupLayout(errorDialog.getContentPane());
        errorDialog.getContentPane().setLayout(errorDialogLayout);
        errorDialogLayout.setHorizontalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(errorConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        errorDialogLayout.setVerticalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(errorConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        successDialog.setSize(new java.awt.Dimension(360, 240));

        successConfirmButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        successConfirmButton.setText("OK");
        successConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        successConfirmButton.setPreferredSize(new java.awt.Dimension(108, 36));
        successConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                successConfirmButtonActionPerformed(evt);
            }
        });

        successMessage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        successMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successMessage.setText("Shift generated successullfy!");
        successMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        successMessage.setPreferredSize(new java.awt.Dimension(360, 160));

        javax.swing.GroupLayout successDialogLayout = new javax.swing.GroupLayout(successDialog.getContentPane());
        successDialog.getContentPane().setLayout(successDialogLayout);
        successDialogLayout.setHorizontalGroup(
            successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successDialogLayout.createSequentialGroup()
                .addComponent(successMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(successDialogLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(successConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        successDialogLayout.setVerticalGroup(
            successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, successDialogLayout.createSequentialGroup()
                .addComponent(successMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(successConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(864, 720));

        header.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Shift Generation");
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.setPreferredSize(new java.awt.Dimension(864, 55));

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
        dateLabel.setText("Date (yyyy-MM-dd)");
        dateLabel.setPreferredSize(new java.awt.Dimension(288, 55));

        dateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        dateInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dateInput.setPreferredSize(new java.awt.Dimension(288, 55));
        dateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dateInputCaretUpdate(evt);
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

        submitButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setPreferredSize(new java.awt.Dimension(108, 36));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(departmentLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roomIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(departmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumberOfPatientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfPatientsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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
        numberOfPatientsValue.setText(selected.getNumberOfPatients() + "");
    }//GEN-LAST:event_roomIDInputActionPerformed

    private void dateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_dateInputCaretUpdate
        // TODO add your handling code here:
        LocalDate temp = LocalDate.now();
        try {
            String[] date = dateInput.getText().split("-");
            temp = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
        catch (Exception e) {
        }
        generatedShift.setDate(temp);
    }//GEN-LAST:event_dateInputCaretUpdate

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if (validateShift() == 1) {
            try {
                shiftDAO.add(generatedShift);
                successDialog.setVisible(true);
                successDialog.setLocationRelativeTo(null);
                initLogic();
            }
            catch (Exception e) {
                errorMessage.setText("Database error: " + e.getMessage());
                errorDialog.setVisible(true);
                errorDialog.setLocationRelativeTo(null);
            }
        }
        else if (validateShift() == -1) {
            errorMessage.setText("Please check shift date!");
            errorDialog.setVisible(true);
            errorDialog.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void errorConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorConfirmButtonActionPerformed
        // TODO add your handling code here:
        errorDialog.setVisible(false);
    }//GEN-LAST:event_errorConfirmButtonActionPerformed

    private void successConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_successConfirmButtonActionPerformed
        // TODO add your handling code here:
        successDialog.setVisible(false);
    }//GEN-LAST:event_successConfirmButtonActionPerformed

    private void typeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeInputActionPerformed
        // TODO add your handling code here:
        generatedShift.setType(typeList.get(typeInput.getSelectedIndex()).getType());
    }//GEN-LAST:event_typeInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumberOfPatientsLabel;
    private javax.swing.JFormattedTextField dateInput;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> departmentInput;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JButton errorConfirmButton;
    private javax.swing.JDialog errorDialog;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel header;
    private javax.swing.JLabel numberOfPatientsValue;
    private javax.swing.JComboBox<String> roomIDInput;
    private javax.swing.JLabel roomIDLabel;
    private javax.swing.JLabel roomSpecialtyLabel;
    private javax.swing.JLabel roomSpecialtyValue;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel roomTypeValue;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton successConfirmButton;
    private javax.swing.JDialog successDialog;
    private javax.swing.JLabel successMessage;
    private javax.swing.JComboBox<String> typeInput;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
