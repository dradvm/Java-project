/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package loc;

import javax.swing.JComponent;

/**
 *
 * @author DELL
 */
public class ManageHealthRecordGUI extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientGUI
     */
    public ManageHealthRecordGUI() {
        initComponents();
    }
    private void changePanel(JComponent component) {
        switchFormPanel2.removeAll();
        switchFormPanel2.add(component);
        switchFormPanel2.repaint();
        switchFormPanel2.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addRecord = new javax.swing.JButton();
        updateRecord = new javax.swing.JButton();
        deleteRecord = new javax.swing.JButton();
        selectRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        switchFormPanel2 = new javaeproject.gui.components.SwitchFormPanel();

        setOpaque(false);

        jPanel1.setOpaque(false);

        addRecord.setText("Add");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });

        updateRecord.setText("Update");
        updateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordActionPerformed(evt);
            }
        });

        deleteRecord.setText("Delete");
        deleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordActionPerformed(evt);
            }
        });

        selectRecord.setText("Select");
        selectRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRecordActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the function you want to perform.");

        switchFormPanel2.setLayout(new javax.swing.BoxLayout(switchFormPanel2, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(deleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(selectRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecord)
                    .addComponent(updateRecord)
                    .addComponent(deleteRecord)
                    .addComponent(selectRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(switchFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed

        changePanel(new AddRecordGUI());
    }//GEN-LAST:event_addRecordActionPerformed

    private void updateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordActionPerformed
        changePanel(new UpdateRecordGUI());
    }//GEN-LAST:event_updateRecordActionPerformed

    private void deleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordActionPerformed
        changePanel(new DeleteRecordGUI());
    }//GEN-LAST:event_deleteRecordActionPerformed

    private void selectRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRecordActionPerformed
        changePanel(new SelectRecordGUI());
    }//GEN-LAST:event_selectRecordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecord;
    private javax.swing.JButton deleteRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectRecord;
    private javaeproject.gui.components.SwitchFormPanel switchFormPanel2;
    private javax.swing.JButton updateRecord;
    // End of variables declaration//GEN-END:variables
}
