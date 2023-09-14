/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.util.Date;
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
    private Date date;
    private String type;
    private int startTime;
    private int endTime;
    private GenerateShiftDAO dao = new GenerateShiftDAO();
    
    public GenerateShift() {
        if (getPosition().equals("Department Head")) {
            if (dao.generateShiftID() == null) {
                System.out.println("Encountered error.");
            }
            else {
                shiftID = dao.generateShiftID();
                departmentID = "D1";
                roomID = "R1";
                //Chua xong
            }
        }
        else {
            System.out.println("You don't have permission to generate shift.");
        }
    }
}
