/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import java.time.LocalDate;
import javaeproject.dao.DepartmentDAO;
import javaeproject.dao.ShiftDAO;
import javaeproject.model.Shift;
import javax.swing.*;
/**
 *
 * @author Voke
 */
public class GenerateShiftGUI extends JFrame {
    
    private final ShiftDAO shiftDAO = new ShiftDAO();
    private final DepartmentDAO departmentDAO = new DepartmentDAO();
    private Shift generatedShift = new Shift();
    
    public GenerateShiftGUI() {
        //Tao container
        setTitle("Generate Shift");
        setSize(720, 1080);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //Them nut logout
        LogoutGUI logoutButton = new LogoutGUI(this);
        add(logoutButton);
        logoutButton.setBounds(620, 0, 100, 50);
        //ShiftID
        JLabel shiftIDLabel = new JLabel("Shift ID: ");
        shiftIDLabel.setVisible(true);
        add(shiftIDLabel);
        shiftIDLabel.setBounds(144, 108, 144, 97);
        JLabel generatedShiftID = new JLabel(shiftDAO.getNewID());
        generatedShiftID.setVisible(true);
        add(generatedShiftID);
        generatedShiftID.setBounds(288, 108, 288, 97);
        //DepartmentID
        JLabel departmentIDLabel = new JLabel("Department ID: ");
        departmentIDLabel.setVisible(true);
        add(departmentIDLabel);
        departmentIDLabel.setBounds(144, 216, 144, 97);
        JComboBox departmentID = new JComboBox();
        for (String item : departmentDAO.getDepartmentNameList()) {
            departmentID.addItem(item);
        }
        departmentID.setVisible(true);
        add(departmentID);
        departmentID.setBounds(288, 216, 288, 97);
        //RoomID
        JLabel roomIDLabel = new JLabel("RoomID");
        roomIDLabel.setVisible(true);
        add(roomIDLabel);
        roomIDLabel.setBounds(144, 324, 144, 97);
//        generatedShift.setShiftID(dao.getNewID());
//        generatedShift.setEmployeeID(null);
//        generatedShift.setDepartmentID("D3");
//        generatedShift.setRoomID("R3");
//        generatedShift.setDate(LocalDate.of(2023, 9, 14));
//        generatedShift.setType("Afternoon");
//        generatedShift.setStartTime(14);
//        generatedShift.setEndTime(22);
//        dao.add(generatedShift);
    }
}
