/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.util.ArrayList;
import javaeproject.dao.HolidayDAO;
import javaeproject.events.EventSelected;
import javaeproject.model.Holiday;

/**
 *
 * @author DELL
 */
public class ViewListTheHolidaysGUI extends javax.swing.JPanel {

    private final HolidayDAO holidayDAO = new HolidayDAO();
    private ArrayList<Holiday> listHoliday;
    private EventSelected event;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
        
        myTable1.addEventSelected(event);
    }
    
    public ViewListTheHolidaysGUI() {
        initComponents();
        init();
        
        jLabel2.setVisible(false);
        reasonPanel1.setVisible(false);
        addEventSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                jLabel2.setVisible(true);
                reasonPanel1.setVisible(true);
                
                reasonPanel1.setReason(listHoliday.get((int) item).getDescription());
            }
        });
    }

    private void init() {
        this.listHoliday = holidayDAO.getListHoliday();
        for (Holiday item : listHoliday) {
            myTable1.addRow(new Object[] {item.getHolidayName(), item.getStartDate().toString(), item.getEndDate().toString(), item.getDescription()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable1 = new javaeproject.gui.components.MyTable();
        jLabel1 = new javax.swing.JLabel();
        reasonPanel1 = new javaeproject.gui.components.ReasonPanel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);

        myTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Holiday Name", "Start Date", "End Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myTable1);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("LIST HOLIDAYS");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("DESCRIPTION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(566, Short.MAX_VALUE))
            .addComponent(reasonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reasonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javaeproject.gui.components.MyTable myTable1;
    private javaeproject.gui.components.ReasonPanel reasonPanel1;
    // End of variables declaration//GEN-END:variables
}
