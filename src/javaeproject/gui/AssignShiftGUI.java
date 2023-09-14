/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import java.time.*;
import java.time.temporal.ChronoUnit;
import javaeproject.dao.ShiftDAO;
import static javaeproject.gui.LoginGUI.*;
import javaeproject.model.Shift;
import javaeproject.model.User;
/**
 *
 * @author Voke
 */
public class AssignShiftGUI {
    
    private User user;
    
    private ShiftDAO dao = new ShiftDAO();
    
    public AssignShiftGUI(User user) {
        this.user = user;
        if (getPosition().equals("Department Head")) {
            start = LocalDate.of(2023, 9, 14);
            end = LocalDate.of(2023, 10, 15);
            if (ChronoUnit.DAYS.between(start, end) > 7) {
                notifyError();
            }
            
        }
    }
    
    public void notifyError() {
        System.out.println("Encountered Error");
    }
}
