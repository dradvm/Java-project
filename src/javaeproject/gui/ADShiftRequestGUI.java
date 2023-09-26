/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.util.ArrayList;
import javaeproject.dao.ShiftDAO;
import javaeproject.dao.ShiftRequestDAO;
import javaeproject.events.EventSelected;
import javaeproject.model.Holiday;
import javaeproject.model.ShiftRequest;
import javaeproject.model.User;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ADShiftRequestGUI extends javax.swing.JPanel {

    private final ShiftRequestDAO shiftRequestDAO = new ShiftRequestDAO();
    private final ShiftDAO shiftDAO = new ShiftDAO();
    private ArrayList<ShiftRequest> shiftRequests;
    private int shiftRequestsSelectedIndex;
    private ShiftRequest shiftRequestSelected;
    private User user;

    private EventSelected event;

    public void addEventSelected(EventSelected event) {
        this.event = event;
        table.addEventSelected(event);
    }

    public ADShiftRequestGUI(User user) {
        initComponents();
        this.user = user;
        init(user);
        spTable.getViewport().setOpaque(false);
        table.setTypeOfTable("ADShiftRequest");

        hide();

        addEventSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                shiftRequestsSelectedIndex = ((int) item);
                shiftRequestSelected = shiftRequests.get(shiftRequestsSelectedIndex);
                show();
                shiftDetailsPanel1.setShift(shiftDAO.getByID(shiftRequestSelected.getCurrentShiftID()));
                shiftDetailsPanel2.setShift(shiftDAO.getByID(shiftRequestSelected.getDesiredShiftID()));
                reasonPanel1.setReason(shiftRequestSelected.getDetails());
            }

        });

    }

    private void init(User user) {
        this.shiftRequests = shiftRequestDAO.getAllRequestPending(user);
        for (ShiftRequest item : shiftRequests) {
            table.addRow(new Object[]{shiftRequestDAO.getEmployeeNameOfShiftRequest(item.getEmployeeID()), item.getCurrentShiftID(), item.getDesiredShiftID(), item.getDetails(), item.getDate()});
        }
    }

    public void hide() {
        shiftDetailsPanel1.setVisible(false);
        shiftDetailsPanel2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        reasonPanel1.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);
    }

    public void show() {
        shiftDetailsPanel1.setVisible(true);
        shiftDetailsPanel2.setVisible(true);
        reasonPanel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jButton1.setVisible(true);
        jButton3.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTable = new javax.swing.JScrollPane();
        table = new javaeproject.gui.components.MyTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shiftDetailsPanel1 = new javaeproject.gui.components.ShiftDetailsPanel();
        jLabel3 = new javax.swing.JLabel();
        shiftDetailsPanel2 = new javaeproject.gui.components.ShiftDetailsPanel();
        jLabel4 = new javax.swing.JLabel();
        reasonPanel1 = new javaeproject.gui.components.ReasonPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setOpaque(false);

        spTable.setBorder(null);
        spTable.setOpaque(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Current Shift", "Desired Shift", "Reason", "Request Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setOpaque(false);
        spTable.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("LIST OF SHIFT REQUEST");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("CURRENT SHIFT");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("DESIRED SHIFT");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("REASON");

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("APPROVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REJECT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(shiftDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(shiftDetailsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reasonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiftDetailsPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiftDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int choice = JOptionPane.showConfirmDialog(
                null, // parentComponent (null cho hộp thoại trung tâm)
                "Are you sure to approve this request?", // message
                "Confirm", // title
                JOptionPane.YES_NO_OPTION // options
        );

        if (choice == JOptionPane.YES_OPTION) {

            shiftRequestDAO.ApproveRequest(shiftRequestSelected);
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Lặp qua từng hàng và xóa chúng
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            model.fireTableDataChanged();
            init(user);
            table.reset();
            hide();
        } else {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int choice = JOptionPane.showConfirmDialog(
                null, // parentComponent (null cho hộp thoại trung tâm)
                "Are you sure to reject this request?", // message
                "Confirm", // title
                JOptionPane.YES_NO_OPTION // options
        );

        if (choice == JOptionPane.YES_OPTION) {

            shiftRequestDAO.RejectRequest(shiftRequestSelected);
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Lặp qua từng hàng và xóa chúng
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            model.fireTableDataChanged();
            init(user);
            table.reset();
            hide();
        } else {

        }

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javaeproject.gui.components.ReasonPanel reasonPanel1;
    private javaeproject.gui.components.ShiftDetailsPanel shiftDetailsPanel1;
    private javaeproject.gui.components.ShiftDetailsPanel shiftDetailsPanel2;
    private javax.swing.JScrollPane spTable;
    private javaeproject.gui.components.MyTable table;
    // End of variables declaration//GEN-END:variables
}
