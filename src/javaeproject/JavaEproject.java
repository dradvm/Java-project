/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaeproject;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.dao.*;
import javaeproject.model.*;
import static javaeproject.model.LoginLogout.*;

/**
 *
 * @author DELL
 */
public class JavaEproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShiftRequestDAO shiftRequestDAO = new ShiftRequestDAO();
        ShiftDAO shiftDAO = new ShiftDAO();
        System.out.println("All Current Shift: ");
        for (Shift item : shiftDAO.getAllCurrentShift("E6")) {
            System.out.println(item.getShiftID());
        }
        System.out.println("All Desired Shift: ");
        for (Shift item : shiftDAO.getAllDesiredShift("E6")) {
            System.out.println(item.getShiftID());
        }

    }

}
