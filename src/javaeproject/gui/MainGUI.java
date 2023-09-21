
package javaeproject.gui;

import java.awt.*;
import javaeproject.events.EventMenuSelected;
import javaeproject.model.MenuModal;
import javaeproject.model.User;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainGUI extends javax.swing.JFrame {
    
    
    private EventMenuSelected event;
    private GenerateShiftGUI generateShiftGUI;
    private final JFrame main = this;
    private User user;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        menu1.addEventMenuSelected(event);
    }
    /**
     * Creates new form TestGUI
     */
    public MainGUI(User user) {
        this.user = user;
        initComponents();
        initAllForm();
        setVisible(true);
        menu1.init(user);
        menu1.initMoving(this);
        setBackground(new Color(0,0,0,0));
        addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void setSeleted(MenuModal itemMenuModal) {
                switch (itemMenuModal.getName()) {
                    case "View Time Schedule" -> changePanel(new Form1());
                    case "Shift Request Approval" -> changePanel(new Form1());
                    case "Assign Doctors & Receptionists to Department" -> changePanel(new Form1());
                    case "Assign Doctor Level" -> changePanel(new Form1());
                    case "Manage Doctors & Receptionists" -> changePanel(new Form1());
                    case "View Holiday List" -> changePanel(new Form1());
                    case "Manage Departments" -> changePanel(new Form1());
                    case "Generate Shift Request" -> changePanel(new Form1());
                    case "Check Shift Request Status" -> changePanel(new Form1());
                    case "Generate Shift" -> changePanel(generateShiftGUI);
                    case "Assign Shift" -> changePanel(new Form1());
                    case "Manage Patients" -> changePanel(new Form1());
                    case "Manage Patient Records" -> changePanel(new Form1());
                    case "View Appointments List" -> changePanel(new Form1());
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
    
    
    private void initAllForm() {
        generateShiftGUI = new GenerateShiftGUI();
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
