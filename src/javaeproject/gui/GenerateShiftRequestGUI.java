
package javaeproject.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.dao.ShiftDAO;
import javaeproject.dao.ShiftRequestDAO;
import javaeproject.events.EventSelected;
import javaeproject.gui.components.ShiftDetailsPanel;
import javaeproject.model.Shift;
import javaeproject.model.ShiftRequest;
import javaeproject.model.User;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

/**
 *
 * @author DELL
 */
public class GenerateShiftRequestGUI extends javax.swing.JPanel {

    private final ShiftDAO shiftDAO = new ShiftDAO();
    private final ShiftRequestDAO shiftRequestDAO = new ShiftRequestDAO();
    private final int maxCharacters = 500;
    private EventSelected event;
    private EventSelected event2;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
        shiftList1.addEventSelected(event);
    }
    
    public void addEventSelectedToShowInformation(EventSelected event) {
        this.event2 = event2;
        //shiftList1.addEventSelectedToShowInformation(event, shiftDetailsPanel1);
        //shiftList2.addEventSelectedToShowInformation(event, shiftDetailsPanel2);
    }
    
    public GenerateShiftRequestGUI(User user) {
        initComponents();
        init(user);
        //setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        
        jTextArea1.setLineWrap(true);
        jLabel4.setText("0/" + maxCharacters);
        ((AbstractDocument) jTextArea1.getDocument()).setDocumentFilter(new DocumentFilter() {
                

                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    int num = fb.getDocument().getLength() + text.length();
                    System.out.println(text);
                    System.out.println(text.length());
                    System.out.println(length);

                    if (num <= maxCharacters) {
                        jLabel4.setText(num + "/" + maxCharacters);
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        
                    }
                }

            @Override
            public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                
                int num = fb.getDocument().getLength() - length;
                jLabel4.setText(num + "/" + maxCharacters);
                super.remove(fb, offset, length);
            }
                
                
            });
        
        
        
        addEventSelected(new EventSelected() {
            
            @Override
            public void setSelected(Object item) {
                Shift itemShift = (Shift) item;
                initDesiredShiftList(user, itemShift);
            }
        });
        
        addEventSelectedToShowInformation(new EventSelected() {

            @Override
            public void setSelected(Object item) {
                
            }
        });
        
        
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!shiftList1.isSelected()) {
                    JOptionPane.showMessageDialog(new JButton("Confirm"), "Please select current shift", "" ,JOptionPane.INFORMATION_MESSAGE);
                }
                else if (!shiftList2.isSelected()) {
                    JOptionPane.showMessageDialog(new JButton("Confirm"), "Please select desired shift", "" ,JOptionPane.INFORMATION_MESSAGE);
                }
                else if ("".equals(jTextArea1.getText().trim())) {
                    JOptionPane.showMessageDialog(new JButton("Confirm"), "Please enter your reason", "" ,JOptionPane.INFORMATION_MESSAGE);
                }
                else if (shiftRequestDAO.isReachedLimit(user)) {
                    JOptionPane.showMessageDialog(new JButton("Confirm"), "You have reached limit of month", "" ,JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    Shift shift1 = shiftList1.getShiftSelected();
                    Shift shift2 = shiftList2.getShiftSelected();
                    if (shiftRequestDAO.isAlreadyExist(user, shift1, shift2 )) {
                        JOptionPane.showMessageDialog(new JButton("Confirm"), "Your change request already exist", "" ,JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        ShiftRequest shiftRequest = new ShiftRequest(shiftRequestDAO.getNewID(), user.getEmployeeID(), shift1.getShiftID(), shift2.getShiftID(), jTextArea1.getText(), LocalDate.now());
                        shiftRequestDAO.add(shiftRequest);
                        JOptionPane.showMessageDialog(new JButton("Confirm"), "Your change request has been successfully created", "" ,JOptionPane.INFORMATION_MESSAGE);
                        shiftList1.resetSelected();
                        shiftList2.resetSelected();
                        jTextArea1.setText("");
                        repaint();
                    }
                }
            }
            
        });
        
    }
    
    private void init(User user) {
        ArrayList<Shift> currentShiftList = shiftDAO.getAllCurrentShift(user);
        for (Shift item : currentShiftList) {
            shiftList1.addItem(item);
        }
    }
    
    private void initDesiredShiftList(User user,Shift shift) {
        shiftList2.reset();
        ArrayList<Shift> derisedShiftList = shiftDAO.getAllDesiredShiftAfterSelect(user, shift);
        for (Shift item : derisedShiftList) {
            shiftList2.addItem(item);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        shiftList1 = new javaeproject.gui.components.ShiftList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        shiftList2 = new javaeproject.gui.components.ShiftList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setOpaque(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setOpaque(false);

        shiftList1.setBorder(null);
        jScrollPane1.setViewportView(shiftList1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setOpaque(false);

        shiftList2.setBorder(null);
        shiftList2.setName(""); // NOI18N
        jScrollPane2.setViewportView(shiftList2);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("SELECT CURRENT SHIFT");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("SELECT DESIRED SHIFT");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("REASON");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("GENERATE REQUEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane3.setViewportView(jTextArea1);

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.decode("#FFFFFF"));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javaeproject.gui.components.ShiftList<String> shiftList1;
    private javaeproject.gui.components.ShiftList<String> shiftList2;
    // End of variables declaration//GEN-END:variables
}
