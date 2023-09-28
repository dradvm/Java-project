/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui;

import java.time.LocalDate;
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
public class AlterHolidayGUI extends javax.swing.JPanel {

    private final HolidayDAO holidayDAO = new HolidayDAO();
    private ArrayList<Holiday> listHoliday;
    private EventSelected event;
    private Holiday holidayAlter;
    private int holidayAlterIndex;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
        
        myTable1.addEventSelected(event);
    }
    
    public AlterHolidayGUI() {
        initComponents();
        init();
        hide();
        addEventSelected(new EventSelected() {
            @Override
            public void setSelected(Object item) {
                holidayAlterIndex = (int) item;
                holidayAlter = listHoliday.get(holidayAlterIndex);
                jTextField1.setText(holidayAlter.getHolidayName());
                startDateInput.setText(holidayAlter.getStartDate().toString());
                endDateInput.setText(holidayAlter.getEndDate().toString());
                jTextArea1.setText(holidayAlter.getDescription());
                startDate = holidayAlter.getStartDate();
                endDate = holidayAlter.getEndDate();
                show();
            }
        });
    }

    private void init() {
        this.listHoliday = holidayDAO.getListHoliday();
        for (Holiday item : listHoliday) {
            myTable1.addRow(new Object[] {item.getHolidayName(), item.getStartDate().toString(), item.getEndDate().toString(), item.getDescription()});
        }
    }
    
    public void hide() {
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        startDateInput.setVisible(false);
        endDateInput.setVisible(false);
        jTextArea1.setVisible(false);
        jTextField1.setVisible(false);
        jScrollPane2.setVisible(false);
        jButton1.setVisible(false);
    }
    
    public void show() {
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        startDateInput.setVisible(true);
        endDateInput.setVisible(true);
        jTextArea1.setVisible(true);
        jTextField1.setVisible(true);
        jScrollPane2.setVisible(true);
        jButton1.setVisible(true);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable1 = new javaeproject.gui.components.MyTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        startDateInput = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endDateInput = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel1.setText("SELECT HOLIDAY TO ALTER");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Holiday Name");

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        startDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        startDateInput.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        startDateInput.setPreferredSize(new java.awt.Dimension(206, 37));
        startDateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                startDateInputCaretUpdate(evt);
            }
        });
        startDateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Start Date");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("End Date");

        endDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        endDateInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        endDateInput.setPreferredSize(new java.awt.Dimension(206, 37));
        endDateInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                endDateInputCaretUpdate(evt);
            }
        });
        endDateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateInputActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Description");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void startDateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_startDateInputCaretUpdate
        startDate = null;
        String[] date = startDateInput.getText().split("-");
        try {
            startDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
        catch (Exception e) {
        }   
    }//GEN-LAST:event_startDateInputCaretUpdate

    private void startDateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateInputActionPerformed

    private void endDateInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_endDateInputCaretUpdate
        endDate = null;
        String[] date = endDateInput.getText().split("-");
        try {
            endDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_endDateInputCaretUpdate

    private void endDateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Holiday name can not empty or contain with filled of spaces", "" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else if (startDate == null) {
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Please enter start date", "" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else if (endDate == null) {
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Please enter end date", "" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else if (startDate.isAfter(endDate)) {
            JOptionPane.showMessageDialog(new JButton("Confirm"), "Your end date must equal or after start date", "" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            int choice = JOptionPane.showConfirmDialog(
            null,  // parentComponent (null cho hộp thoại trung tâm)
            "Are you sure to update this holiday?", // message
            "Confirm", // title
            JOptionPane.YES_NO_OPTION  // options
            );
        
            if (choice == JOptionPane.YES_OPTION) {
                holidayDAO.update(new Holiday(holidayAlter.getHolidayID(), jTextField1.getText(), startDate, endDate, jTextArea1.getText()));
                this.listHoliday = holidayDAO.getListHoliday();
                
                
                DefaultTableModel model = (DefaultTableModel) myTable1.getModel();
                model.setValueAt( jTextField1.getText(),holidayAlterIndex , 0);
                model.setValueAt( startDate.toString(),holidayAlterIndex , 1);
                model.setValueAt( endDate.toString(),holidayAlterIndex , 2);
                model.setValueAt( jTextArea1.getText(),holidayAlterIndex , 3);
                
                model.fireTableDataChanged();
                

                jTextArea1.setText("");
                jTextField1.setText("");
                startDateInput.setText("");
                endDateInput.setText("");
                
                hide();
                myTable1.reset();
            } else {

            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField endDateInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javaeproject.gui.components.MyTable myTable1;
    private javax.swing.JFormattedTextField startDateInput;
    // End of variables declaration//GEN-END:variables
}
