/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import java.time.LocalDate;
import javaeproject.dao.ShiftDAO;
import javaeproject.model.Shift;
import javax.swing.*;
/**
 *
 * @author Voke
 */
public class GenerateShiftGUI extends JFrame {
    
    private final ShiftDAO dao = new ShiftDAO();
    private Shift generatedShift;
    
    public GenerateShiftGUI() {
        LogoutGUI logoutButton = new LogoutGUI(this);
        generatedShift = new Shift();
        generatedShift.setShiftID(dao.getNewID());
        generatedShift.setEmployeeID(null);
        generatedShift.setDepartmentID("D3");
        generatedShift.setRoomID("R3");
        generatedShift.setDate(LocalDate.of(2023, 9, 14));
        generatedShift.setType("Afternoon");
        generatedShift.setStartTime(14);
        generatedShift.setEndTime(22);
        dao.add(generatedShift);
    }
}
