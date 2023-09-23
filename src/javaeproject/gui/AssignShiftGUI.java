package javaeproject.gui;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AssignShiftGUI extends javax.swing.JPanel {
    
    private LocalDate startDate;
    private LocalDate endDate;

    public AssignShiftGUI() {
        initComponents();
        shiftPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorDialog = new javax.swing.JDialog();
        errorConfirmButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        startDateInput = new javax.swing.JFormattedTextField();
        endDateLabel = new javax.swing.JLabel();
        endDateInput = new javax.swing.JFormattedTextField();
        dateRangeButton = new javax.swing.JButton();
        shiftMessage = new javax.swing.JLabel();
        shiftPanel = new javax.swing.JPanel();
        shiftIDLabel = new javax.swing.JLabel();
        shiftIDInput = new javax.swing.JComboBox<>();
        departmentLabel = new javax.swing.JLabel();
        departmentValue = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValue = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateValue = new javax.swing.JLabel();
        roomIDLabel = new javax.swing.JLabel();
        roomIDValue = new javax.swing.JLabel();
        roomSpecialtyLabel = new javax.swing.JLabel();
        roomSpecialtyValue = new javax.swing.JLabel();
        employeeMessage = new javax.swing.JLabel();
        employeePanel = new javax.swing.JPanel();
        employeeLabel = new javax.swing.JLabel();
        employeeInput = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        genderValue = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        positionValue = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dobValue = new javax.swing.JLabel();
        employeeSpecialtyLabel = new javax.swing.JLabel();
        employeeSpecialtyValue = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        errorDialog.setTitle("Error");
        errorDialog.setResizable(false);
        errorDialog.setSize(new java.awt.Dimension(480, 360));

        errorConfirmButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        errorConfirmButton.setText("OK");
        errorConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorConfirmButton.setPreferredSize(new java.awt.Dimension(108, 36));
        errorConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorConfirmButtonActionPerformed(evt);
            }
        });

        errorMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Error message");
        errorMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorMessage.setPreferredSize(new java.awt.Dimension(360, 160));

        javax.swing.GroupLayout errorDialogLayout = new javax.swing.GroupLayout(errorDialog.getContentPane());
        errorDialog.getContentPane().setLayout(errorDialogLayout);
        errorDialogLayout.setHorizontalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(errorConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        errorDialogLayout.setVerticalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        setPreferredSize(new java.awt.Dimension(825, 744));

        startDateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        startDateLabel.setText("Starting date: ");
        startDateLabel.setPreferredSize(new java.awt.Dimension(98, 39));

        startDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        startDateInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        startDateInput.setPreferredSize(new java.awt.Dimension(206, 39));
        startDateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                startDateInputCaretUpdate(evt);
            }
        });

        endDateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        endDateLabel.setText("Ending Date: ");
        endDateLabel.setPreferredSize(new java.awt.Dimension(93, 39));

        endDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        endDateInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        endDateInput.setPreferredSize(new java.awt.Dimension(206, 39));
        endDateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                endDateInputCaretUpdate(evt);
            }
        });

        dateRangeButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dateRangeButton.setText("Select");
        dateRangeButton.setPreferredSize(new java.awt.Dimension(78, 26));
        dateRangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRangeButtonActionPerformed(evt);
            }
        });

        shiftMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        shiftMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiftMessage.setText("No shift to assign in the date range");
        shiftMessage.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        shiftMessage.setPreferredSize(new java.awt.Dimension(619, 39));

        shiftIDLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        shiftIDLabel.setText("Shift ID: ");
        shiftIDLabel.setPreferredSize(new java.awt.Dimension(58, 37));

        shiftIDInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        shiftIDInput.setPreferredSize(new java.awt.Dimension(206, 39));

        departmentLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        departmentLabel.setText("Department:");
        departmentLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        departmentValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        departmentValue.setText("[DepartmentName]");
        departmentValue.setPreferredSize(new java.awt.Dimension(206, 39));

        typeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        typeLabel.setText("Type:");
        typeLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        typeValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        typeValue.setText("[Type]");
        typeValue.setPreferredSize(new java.awt.Dimension(206, 39));

        dateLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateLabel.setText("Date:");
        dateLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        dateValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateValue.setText("[Date]");
        dateValue.setPreferredSize(new java.awt.Dimension(206, 39));

        roomIDLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomIDLabel.setText("Room ID:");
        roomIDLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        roomIDValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomIDValue.setText("[RoomID]");
        roomIDValue.setPreferredSize(new java.awt.Dimension(206, 39));

        roomSpecialtyLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomSpecialtyLabel.setText("Room specialty:");
        roomSpecialtyLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        roomSpecialtyValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomSpecialtyValue.setText("[RoomSpecialty]");
        roomSpecialtyValue.setPreferredSize(new java.awt.Dimension(206, 39));

        employeeMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        employeeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeMessage.setText("No employee available for this thift");
        employeeMessage.setPreferredSize(new java.awt.Dimension(619, 39));

        employeeLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        employeeLabel.setText("Employee:");
        employeeLabel.setPreferredSize(new java.awt.Dimension(72, 39));

        employeeInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeInput.setPreferredSize(new java.awt.Dimension(206, 39));

        genderLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        genderLabel.setText("Gender:");
        genderLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        genderValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        genderValue.setText("[Gender]");
        genderValue.setPreferredSize(new java.awt.Dimension(206, 39));

        positionLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        positionLabel.setText("Position:");
        positionLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        positionValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        positionValue.setText("[Position]");
        positionValue.setPreferredSize(new java.awt.Dimension(206, 39));

        dobLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dobLabel.setText("Date of birth:");
        dobLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        dobValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dobValue.setText("[DoB]");
        dobValue.setPreferredSize(new java.awt.Dimension(206, 39));

        employeeSpecialtyLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeSpecialtyLabel.setText("Specialty:");
        employeeSpecialtyLabel.setPreferredSize(new java.awt.Dimension(206, 39));

        employeeSpecialtyValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeSpecialtyValue.setText("[Specialty]");
        employeeSpecialtyValue.setPreferredSize(new java.awt.Dimension(206, 39));

        submitButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeePanelLayout = new javax.swing.GroupLayout(employeePanel);
        employeePanel.setLayout(employeePanelLayout);
        employeePanelLayout.setHorizontalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeePanelLayout.createSequentialGroup()
                        .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(employeePanelLayout.createSequentialGroup()
                        .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton)
                            .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(employeePanelLayout.createSequentialGroup()
                                    .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, 0)
                                    .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(employeePanelLayout.createSequentialGroup()
                                            .addComponent(positionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(dobValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(employeePanelLayout.createSequentialGroup()
                                            .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(employeePanelLayout.createSequentialGroup()
                                    .addComponent(employeeSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        employeePanelLayout.setVerticalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(employeeSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeeSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout shiftPanelLayout = new javax.swing.GroupLayout(shiftPanel);
        shiftPanel.setLayout(shiftPanelLayout);
        shiftPanelLayout.setHorizontalGroup(
            shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shiftIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(shiftPanelLayout.createSequentialGroup()
                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomIDValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(shiftPanelLayout.createSequentialGroup()
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(employeeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addComponent(employeePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        shiftPanelLayout.setVerticalGroup(
            shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(shiftIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shiftIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomIDValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(employeeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shiftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateRangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(dateRangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(shiftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateRangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRangeButtonActionPerformed
        if (startDate == null || endDate == null) {
            errorMessage.setText("Please enter date range");
            errorDialog.setLocationRelativeTo(null);
            errorDialog.setVisible(true);
            return;
        }
        long range = ChronoUnit.DAYS.between(startDate, endDate);
        if (range <= 0 || range > 7) {
            errorMessage.setText("Date range must be greater than 0 and less than 7");
            errorDialog.setLocationRelativeTo(null);
            errorDialog.setVisible(true);
            return;
        }
        
    }//GEN-LAST:event_dateRangeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void startDateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_startDateInputCaretUpdate
        shiftPanel.setVisible(false);
        startDate = null;
        String[] date = startDateInput.getText().split("-");
        try {
            startDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_startDateInputCaretUpdate

    private void endDateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_endDateInputCaretUpdate
        shiftPanel.setVisible(false);
        endDate = null;
        String[] date = endDateInput.getText().split("-");
        try {
            endDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_endDateInputCaretUpdate

    private void errorConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorConfirmButtonActionPerformed
        errorDialog.setVisible(false);
    }//GEN-LAST:event_errorConfirmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton dateRangeButton;
    private javax.swing.JLabel dateValue;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel departmentValue;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobValue;
    private javax.swing.JComboBox<String> employeeInput;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel employeeMessage;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JLabel employeeSpecialtyLabel;
    private javax.swing.JLabel employeeSpecialtyValue;
    private javax.swing.JFormattedTextField endDateInput;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JButton errorConfirmButton;
    private javax.swing.JDialog errorDialog;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderValue;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel positionValue;
    private javax.swing.JLabel roomIDLabel;
    private javax.swing.JLabel roomIDValue;
    private javax.swing.JLabel roomSpecialtyLabel;
    private javax.swing.JLabel roomSpecialtyValue;
    private javax.swing.JComboBox<String> shiftIDInput;
    private javax.swing.JLabel shiftIDLabel;
    private javax.swing.JLabel shiftMessage;
    private javax.swing.JPanel shiftPanel;
    private javax.swing.JFormattedTextField startDateInput;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    // End of variables declaration//GEN-END:variables
}
