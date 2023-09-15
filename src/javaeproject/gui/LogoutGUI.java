/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Voke
 */
public class LogoutGUI extends JButton {
    
    JFrame frame;
    
    public LogoutGUI(JFrame frame) {
        this.frame = frame;
        setText("Logout");
        setVisible(true);
        addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginGUI login = new LoginGUI();
            }
        });
    }
}
