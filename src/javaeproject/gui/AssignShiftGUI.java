package javaeproject.gui;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javaeproject.dao.DepartmentDAO;
import javaeproject.dao.EmployeeDAO;
import javaeproject.dao.RoomDAO;
import javaeproject.dao.ShiftDAO;
import javaeproject.model.Shift;
import javaeproject.model.User;

public class AssignShiftGUI extends javax.swing.JPanel {
    
    private final ShiftDAO shiftDAO;
    private final DepartmentDAO departmentDAO;
    private final RoomDAO roomDAO;
    private final EmployeeDAO employeeDAO;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Shift> shiftList;
    private ArrayList<User> employeeList;
    private Shift shift;
    private User employee;

    public AssignShiftGUI() {
        shiftDAO = new ShiftDAO();
        departmentDAO = new DepartmentDAO();
        roomDAO = new RoomDAO();
        employeeDAO = new EmployeeDAO();
        shift = new Shift();
        employee = new User();
        initComponents();
        initLogic();
    }

    public void initLogic() {
        shift = new Shift();
        employee = new User();
        shiftMessage.setVisible(false);
        shiftPanel.setVisible(false);
        setVisibleEmployeeInformation(false);
        startDateInput.setText("");
        endDateInput.setText("");
        startDate = null;
        endDate = null;
    }
    
    private void setVisibleEmployeeInformation(boolean state) {
        employeeLabel.setVisible(state);
        employeeInput.setVisible(state);
        genderLabel.setVisible(state);
        genderValue.setVisible(state);
        positionLabel.setVisible(state);
        positionValue.setVisible(state);
        dobLabel.setVisible(state);
        dobValue.setVisible(state);
        employeeSpecialtyLabel.setVisible(state);
        employeeSpecialtyValue.setVisible(state);
        submitButton.setVisible(state);
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

        successDialog.setSize(new java.awt.Dimension(360, 240));

        successConfirmButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        successConfirmButton.setText("OK");
        successConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        successConfirmButton.setPreferredSize(new java.awt.Dimension(108, 36));
        successConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                successConfirmButtonActionPerformed(evt);
            }
        });

        successMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        successMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successMessage.setText("Shift assigned successullfy!");
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

        setMinimumSize(new java.awt.Dimension(825, 744));
        setPreferredSize(new java.awt.Dimension(825, 744));

        startDateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        startDateLabel.setText("Starting date (yyyy-MM-dd):");
        startDateLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        startDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        startDateInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        startDateInput.setPreferredSize(new java.awt.Dimension(206, 37));
        startDateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                startDateInputCaretUpdate(evt);
            }
        });

        endDateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        endDateLabel.setText("Ending Date (yyy-MM-dd):");
        endDateLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        endDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        endDateInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        endDateInput.setPreferredSize(new java.awt.Dimension(206, 37));
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
        shiftMessage.setPreferredSize(new java.awt.Dimension(619, 37));

        shiftPanel.setMinimumSize(new java.awt.Dimension(0, 592));
        shiftPanel.setPreferredSize(new java.awt.Dimension(825, 596));

        shiftIDLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        shiftIDLabel.setText("Shift ID: ");
        shiftIDLabel.setPreferredSize(new java.awt.Dimension(58, 37));

        shiftIDInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        shiftIDInput.setPreferredSize(new java.awt.Dimension(206, 37));
        shiftIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftIDInputActionPerformed(evt);
            }
        });

        departmentLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        departmentLabel.setText("Department:");
        departmentLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        departmentValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        departmentValue.setText("[DepartmentName]");
        departmentValue.setPreferredSize(new java.awt.Dimension(206, 37));

        typeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        typeLabel.setText("Type:");
        typeLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        typeValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        typeValue.setText("[Type]");
        typeValue.setPreferredSize(new java.awt.Dimension(206, 37));

        dateLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateLabel.setText("Date:");
        dateLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        dateValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateValue.setText("[Date]");
        dateValue.setPreferredSize(new java.awt.Dimension(206, 37));

        roomIDLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomIDLabel.setText("Room ID:");
        roomIDLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        roomIDValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomIDValue.setText("[RoomID]");
        roomIDValue.setPreferredSize(new java.awt.Dimension(206, 37));

        roomSpecialtyLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomSpecialtyLabel.setText("Room specialty:");
        roomSpecialtyLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        roomSpecialtyValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomSpecialtyValue.setText("[RoomSpecialty]");
        roomSpecialtyValue.setPreferredSize(new java.awt.Dimension(206, 37));

        employeeMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        employeeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeMessage.setText("No employee available for this thift");
        employeeMessage.setPreferredSize(new java.awt.Dimension(619, 37));

        employeeLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        employeeLabel.setText("Employee:");
        employeeLabel.setPreferredSize(new java.awt.Dimension(72, 37));

        employeeInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeInput.setPreferredSize(new java.awt.Dimension(206, 37));
        employeeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeInputActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        genderLabel.setText("Gender:");
        genderLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        genderValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        genderValue.setText("[Gender]");
        genderValue.setPreferredSize(new java.awt.Dimension(206, 37));

        positionLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        positionLabel.setText("Position:");
        positionLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        positionValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        positionValue.setText("[Position]");
        positionValue.setPreferredSize(new java.awt.Dimension(206, 37));

        dobLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dobLabel.setText("Date of birth:");
        dobLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        dobValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dobValue.setText("[DoB]");
        dobValue.setPreferredSize(new java.awt.Dimension(206, 37));

        employeeSpecialtyLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeSpecialtyLabel.setText("Specialty:");
        employeeSpecialtyLabel.setPreferredSize(new java.awt.Dimension(206, 37));

        employeeSpecialtyValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        employeeSpecialtyValue.setText("[Specialty]");
        employeeSpecialtyValue.setPreferredSize(new java.awt.Dimension(206, 37));

        submitButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shiftPanelLayout = new javax.swing.GroupLayout(shiftPanel);
        shiftPanel.setLayout(shiftPanelLayout);
        shiftPanelLayout.setHorizontalGroup(
            shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shiftPanelLayout.createSequentialGroup()
                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(shiftPanelLayout.createSequentialGroup()
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departmentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(shiftPanelLayout.createSequentialGroup()
                                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(typeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(shiftPanelLayout.createSequentialGroup()
                                .addComponent(roomIDValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(employeeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(employeeSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(employeeSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(shiftPanelLayout.createSequentialGroup()
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(shiftPanelLayout.createSequentialGroup()
                        .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(37, 37, 37)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIDValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(employeeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(shiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(employeeSpecialtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employeeSpecialtyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateRangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addComponent(shiftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(6, 6, 6)
                .addComponent(dateRangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(shiftMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shiftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (range < 0) {
            errorMessage.setText("The ending date must be equal to or after the starting date");
            errorDialog.setLocationRelativeTo(null);
            errorDialog.setVisible(true);
            return;
        }
        if (range > 6) {
            errorMessage.setText("The date range must be within 7 days");
            errorDialog.setLocationRelativeTo(null);
            errorDialog.setVisible(true);
            return;
        }
        shiftList = shiftDAO.getAssignableShiftList(startDate, endDate);
        if (shiftList.isEmpty()) {
            shiftMessage.setVisible(true);
        }
        else {
            shiftPanel.setVisible(true);
            shiftIDInput.removeAllItems();
            for (Shift item : shiftList) {
                shiftIDInput.addItem(item.getShiftID());
            }
            shiftIDInput.setSelectedIndex(0);
        }
    }//GEN-LAST:event_dateRangeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            shiftDAO.assignShift(shift);
            successDialog.setVisible(true);
            successDialog.setLocationRelativeTo(null);
            initLogic();
        }
        catch (Exception e) {
            errorMessage.setText("Encountered database error");
            errorDialog.setVisible(true);
            errorDialog.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void startDateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_startDateInputCaretUpdate
        shiftMessage.setVisible(false);
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
        shiftMessage.setVisible(false);
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

    private void shiftIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftIDInputActionPerformed
        employeeMessage.setVisible(false);
        setVisibleEmployeeInformation(false);
        if (shiftIDInput.getSelectedIndex() >= 0) {
            shift = shiftList.get(shiftIDInput.getSelectedIndex());
            departmentValue.setText(departmentDAO.getNameByID(shift.getDepartmentID()));
            typeValue.setText(shift.getType());
            dateValue.setText(shift.getDate().toString());
            roomIDValue.setText(shift.getRoomID());
            roomSpecialtyValue.setText(roomDAO.getByID(shift.getRoomID()).getRoomSpecialty());
            employeeList = employeeDAO.getAssignableEmployeeList(shift, roomDAO.getByID(shift.getRoomID()));
            if (employeeList.isEmpty()) {
                employeeMessage.setVisible(true);
            }
            else {
                setVisibleEmployeeInformation(true);
                employeeInput.removeAllItems();
                for (User item : employeeList) {
                    employeeInput.addItem(item.getEmployeeName());
                }
                employeeInput.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_shiftIDInputActionPerformed

    private void employeeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeInputActionPerformed
        shift.setEmployeeID(null);
        if (employeeInput.getSelectedIndex() >= 0) {
            employee = employeeList.get(employeeInput.getSelectedIndex());
            genderValue.setText(employee.getGender());
            positionValue.setText(employee.getPosition());
            dobValue.setText(employee.getEmployeeDoB().toString());
            employeeSpecialtyValue.setText(employee.getEmployeeSpecialty());
            shift.setEmployeeID(employee.getEmployeeID());
        }
    }//GEN-LAST:event_employeeInputActionPerformed

    private void successConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_successConfirmButtonActionPerformed
        successDialog.setVisible(false);
    }//GEN-LAST:event_successConfirmButtonActionPerformed

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
    private javax.swing.JButton successConfirmButton;
    private javax.swing.JDialog successDialog;
    private javax.swing.JLabel successMessage;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    // End of variables declaration//GEN-END:variables
}
