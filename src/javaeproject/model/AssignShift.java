/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.time.*;
import java.time.temporal.ChronoUnit;
import javaeproject.dao.AssignShiftDAO;
import static javaeproject.model.LoginLogout.*;
/**
 *
 * @author Voke
 */
public class AssignShift {
    
    private LocalDate start;
    private LocalDate end;
    private String shiftID;
    private String EmployeeID;
    private String name;
    private String gender;
    private String position;
    private String specialty;
    private AssignShiftDAO dao = new AssignShiftDAO();
    
    public AssignShift() {
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
