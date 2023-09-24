/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.util.ArrayList;
import javaeproject.dao.ShiftDAO;
import javaeproject.dao.ShiftRequestDAO;
import javaeproject.events.EventSelected;
import javaeproject.model.ShiftRequest;
import javaeproject.model.User;

/**
 *
 * @author DELL
 */
public class ADShiftRequestGUI extends javax.swing.JPanel {

    private final ShiftRequestDAO shiftRequestDAO = new ShiftRequestDAO();
    private final ShiftDAO shiftDAO = new ShiftDAO();
    private ArrayList<ShiftRequest> shiftRequests;
    
    private EventSelected event;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
        table.addEventSelected(event);
    }
    
    public ADShiftRequestGUI(User user) {
        initComponents();
        init(user);
        spTable.getViewport().setOpaque(false);
        table.setTypeOfTable("ADShiftRequest");
        
        shiftDetailsPanel1.setVisible(false);
        shiftDetailsPanel2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        reasonPanel1.setVisible(false);
        
        
        
        addEventSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                shiftDetailsPanel1.setVisible(true);
                shiftDetailsPanel2.setVisible(true);
                reasonPanel1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                shiftDetailsPanel1.setShift(shiftDAO.getByID(shiftRequests.get((int) item).getCurrentShiftID()));
                shiftDetailsPanel2.setShift(shiftDAO.getByID(shiftRequests.get((int) item).getDesiredShiftID()));
                reasonPanel1.setReason(shiftRequests.get((int) item).getDetails());
            }
            
        });
        
    }

    private void init(User user) {
        this.shiftRequests = shiftRequestDAO.getAllRequestPending();
        for (ShiftRequest item : shiftRequests) {
            table.addRow(new Object[] {shiftRequestDAO.getEmployeeNameOfShiftRequest(item.getEmployeeID()), item.getCurrentShiftID(), item.getDesiredShiftID(), item.getDetails(), item.getDate()});
        }
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reasonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(shiftDetailsPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shiftDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
