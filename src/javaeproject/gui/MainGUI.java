
package javaeproject.gui;

import java.awt.*;
import javaeproject.events.EventSelected;
import javaeproject.model.MenuModal;
import javaeproject.model.User;
import javax.swing.JComponent;
import javax.swing.JFrame;
import loc.ManagePatientGUI;
import loc.ManageHealthRecordGUI;

public class MainGUI extends javax.swing.JFrame {
    
    
    private EventSelected event;
    private final JFrame main = this;
    private User user;
    
    public void addEventMenuSelected(EventSelected event) {
        this.event = event;
        menu1.addEventMenuSelected(event);
    }
    /**
     * Creates new form TestGUI
     */
    public MainGUI(User user) {
        this.user = user;
        initComponents();
        setVisible(true);
        menu1.init(user);
        menu1.initMoving(this);
        setBackground(new Color(0,0,0,0));
        addEventMenuSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                MenuModal itemMenuModal = (MenuModal) item;
                switch (itemMenuModal.getName()) {
                    case "View Time Schedule" -> changePanel(new ViewTimeSchedule());
                    case "Shift Request Approval" -> changePanel(new ADShiftRequestGUI(user));
                    case "Assign Doctors & Receptionists to Department" -> changePanel(new Form1());
                    case "Assign Doctor Level" -> changePanel(new Form1());
                    case "Manage Doctors & Receptionists" -> changePanel(new ManageDoctorAndReceptionestGUI());
                    case "View Holiday List" -> changePanel(new ManageHolidayGUI());
                    case "Manage Departments" -> changePanel(new ManageDepartmentGUI());
                    case "Generate Shift Request" -> changePanel(new GenerateShiftRequestGUI(user));
                    case "Check Shift Request Status" -> changePanel(new CheckStatusShiftRequestGUI(user));
                    case "Generate Shift" -> changePanel(new GenerateShiftGUI());
                    case "Assign Shift" -> changePanel(new AssignShiftGUI());
                    case "Manage Patients" -> changePanel(new ManagePatientGUI());
                    case "Manage Patient Records" -> changePanel(new ManageHealthRecordGUI());
                    case "View Appointments List" -> changePanel(new ViewAppointmentList());
                    case "Log Out" -> logout();
                    default -> {
                    }
                }
            }
        });
    }
    private void changePanel(JComponent component) {
        switchFormPanel1.removeAll();
        switchFormPanel1.add(component);
        switchFormPanel1.repaint();
        switchFormPanel1.revalidate();
    }
    
    
    public void logout() {
        this.dispose();
        user = null;
        LoginGUI login = new LoginGUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new javaeproject.gui.components.PanelBorder();
        menu1 = new javaeproject.gui.components.Menu();
        switchFormPanel1 = new javaeproject.gui.components.SwitchFormPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        switchFormPanel1.setLayout(new javax.swing.BoxLayout(switchFormPanel1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(switchFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaeproject.gui.components.Menu menu1;
    private javaeproject.gui.components.PanelBorder panelBorder1;
    private javaeproject.gui.components.SwitchFormPanel switchFormPanel1;
    // End of variables declaration//GEN-END:variables
}
