/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.util.ArrayList;
import javaeproject.dao.HolidayDAO;
import javaeproject.events.EventSelected;
import javaeproject.model.Holiday;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class DeleteHolidayGUI extends javax.swing.JPanel {

    private final HolidayDAO holidayDAO = new HolidayDAO();
    private ArrayList<Holiday> listHoliday;
    private EventSelected event;
    private Holiday holidayDelete;
    private int holidayDeleteIndex;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
        
        myTable1.addEventSelected(event);
    }
    
    public DeleteHolidayGUI() {
        initComponents();
        init();
        addEventSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                holidayDelete = listHoliday.get((int) item);
                holidayDeleteIndex = (int) item;
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
        jButton1 = new javax.swing.JButton();

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
        jLabel1.setText("SELECT HOLIDAY TO DELETE");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int choice = JOptionPane.showConfirmDialog(
            null,  // parentComponent (null cho hộp thoại trung tâm)
            "Are you sure to delete this holiday?", // message
            "Confirm", // title
            JOptionPane.YES_NO_OPTION  // options
        );
        
        if (choice == JOptionPane.YES_OPTION) {
            holidayDAO.delete(holidayDelete);
            DefaultTableModel model = (DefaultTableModel) myTable1.getModel();
            model.removeRow(holidayDeleteIndex);
            model.fireTableDataChanged();
            this.listHoliday.remove(holidayDeleteIndex);
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Delete holiday successfully", "" ,JOptionPane.INFORMATION_MESSAGE);
        } else {
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaeproject.gui.components.MyTable myTable1;
    // End of variables declaration//GEN-END:variables
}
