/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package javaeproject.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Voke
 */
public class LogoutGUI extends JButton {

    private JFrame frame;
    /**
     * Creates new form Logout
     */
    public LogoutGUI() {
        initComponents();
        setVisible(true);
        addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginGUI login = new LoginGUI();
            }
        });
    }
    
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setText("Logout");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
