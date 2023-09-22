/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaeproject.gui.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javaeproject.model.Shift;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author DELL
 */
public class ShiftItem extends javax.swing.JPanel {

    private boolean selected;
    private final int marginBottom = 5;
    
    public ShiftItem(Shift shift) {
        initComponents();
        setOpaque(false);
        switch (shift.getType()) {
            case "Morning" -> jLabel1.setIcon(new ImageIcon(getClass().getResource("/javaeproject/gui/assests/sun.png")));
            case "Afternoon" -> jLabel1.setIcon(new ImageIcon(getClass().getResource("/javaeproject/gui/assests/moon.png")));
            case "Fulltime" -> jLabel1.setIcon(new ImageIcon(getClass().getResource("/javaeproject/gui/assests/24-hours.png")));

            default -> throw new AssertionError();
        }
        
        jLabel2.setText(shift.getDate().toString());
        setBorder(new EmptyBorder(marginBottom,0,marginBottom,0));
    }

    
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.decode("#118CDF"), 0, getHeight(), Color.decode("#1A5187"));
        g2.setPaint(gradientPaint);
        if (selected) {
            gradientPaint = new GradientPaint(0, 0, Color.decode("#256B9A"), 0, getHeight(), Color.decode("#0F2133"));
            g2.setPaint(gradientPaint);
        }
        g2.fillRoundRect(0, marginBottom, getWidth(), getHeight() - marginBottom*2, 5, 5);
        
        super.paintComponent(g); 
    }
    
    
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
