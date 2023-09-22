/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package loc;

import javaeproject.gui.Form1;
import javax.swing.JComponent;

/**
 *
 * @author DELL
 */
public class ManagePatientGUI extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientGUI
     */
    public ManagePatientGUI() {
        initComponents();
    }
    
    private void changePanel(JComponent component) {
        switchFormPanel1.removeAll();
        switchFormPanel1.add(component);
        switchFormPanel1.repaint();
        switchFormPanel1.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addPerform = new javax.swing.JButton();
        updatePerform = new javax.swing.JButton();
        deletePerform = new javax.swing.JButton();
        selectPerform = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        switchFormPanel1 = new javaeproject.gui.components.SwitchFormPanel();

        setOpaque(false);

        jPanel1.setOpaque(false);

        addPerform.setText("Add");
        addPerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPerformActionPerformed(evt);
            }
        });

        updatePerform.setText("Update");
        updatePerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePerformActionPerformed(evt);
            }
        });

        deletePerform.setText("Delete");
        deletePerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePerformActionPerformed(evt);
            }
        });

        selectPerform.setText("Select");
        selectPerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPerformActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the function you want to perform.");

        switchFormPanel1.setLayout(new javax.swing.BoxLayout(switchFormPanel1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addPerform, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updatePerform, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(deletePerform, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(selectPerform, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPerform)
                    .addComponent(updatePerform)
                    .addComponent(deletePerform)
                    .addComponent(selectPerform))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(switchFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPerformActionPerformed

        changePanel(new AddAndUpdateGUI());
    }//GEN-LAST:event_addPerformActionPerformed

    private void updatePerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePerformActionPerformed
        changePanel(new AddAndUpdateGUI());
    }//GEN-LAST:event_updatePerformActionPerformed

    private void deletePerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePerformActionPerformed
        changePanel(new DeletePatientGUI());
    }//GEN-LAST:event_deletePerformActionPerformed

    private void selectPerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPerformActionPerformed
        changePanel(new SelectPatientGUI());
    }//GEN-LAST:event_selectPerformActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPerform;
    private javax.swing.JButton deletePerform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectPerform;
    private javaeproject.gui.components.SwitchFormPanel switchFormPanel1;
    private javax.swing.JButton updatePerform;
    // End of variables declaration//GEN-END:variables
}
