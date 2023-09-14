/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.time.LocalDate;
import javaeproject.dao.GenerateShiftDAO;
import static javaeproject.model.LoginLogout.*;
/**
 *
 * @author Voke
 */
public class GenerateShift {
    
    private String shiftID;
    private String departmentID;
    private String roomID;
    private LocalDate date;
    private String type;
    private int startTime;
    private int endTime;
    private final GenerateShiftDAO dao = new GenerateShiftDAO();
    
    public GenerateShift() {
        if (getPosition().equals("Department Head")) {
            if (dao.generateShiftID() == null) {
                notifyError();
            }
            else {
                shiftID = dao.generateShiftID();
                departmentID = "D1";
                roomID = "R1";
                date = LocalDate.now();
                type = "Morning";
                startTime = 6;
                endTime = 14;
                if (dao.insertShift(shiftID, departmentID, roomID, date, type, startTime, endTime)) {
                    notifySuccess();
                }
                else {
                    notifyError();
                }
            }
        }
    }
    
    public void notifySuccess() {
        System.out.println("Shift generated successfully");
    }
    
    public void notifyError() {
        System.out.println("Encountered error");
    }
}
