/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import javaeproject.dao.ShiftDAO;
import javaeproject.model.User;
import javax.swing.*;
/**
 *
 * @author Voke
 */
public class AssignShiftGUI extends JFrame {
    
    private ShiftDAO dao = new ShiftDAO();
    
    public AssignShiftGUI(User user) {
        LogoutGUI logoutButton = new LogoutGUI(this); 
    }
}
