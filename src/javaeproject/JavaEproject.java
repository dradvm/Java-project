/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaeproject;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javaeproject.connection.ConnectionDB;
import javaeproject.dao.*;
import javaeproject.gui.GenerateShiftGUI;
import javaeproject.model.*;

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
        LoginDAO userDAO = new LoginDAO();
        GenerateShiftGUI test = new GenerateShiftGUI();
        User myUser = userDAO.getUserFromDB("e20username", "e20password");
        ArrayList<Shift> currentShifts = shiftDAO.getAllCurrentShift(myUser);
        ArrayList<Shift> desiredShifts = shiftDAO.getAllDesiredShift(myUser);
        Scanner sc = new Scanner(System.in);
        System.out.println("All Current Shift: ");
        for (Shift item : currentShifts) {
            System.out.println(item.getShiftID() + " " + item.getDate() + " " + item.getType());
        }
        System.out.println("All Desired Shift: ");
        for (Shift item : desiredShifts) {
            System.out.println(item.getShiftID() + " " + item.getDate() + " " + item.getType());
        }
        System.out.println("Select current shift: ");
        String cs = sc.nextLine();
        System.out.println("Select desired shift: ");
        String ds = sc.nextLine();
        
        Shift cshift = shiftDAO.getByID(cs);
        Shift dshift = shiftDAO.getByID(ds);
        
        shiftDAO.performChangeShift(cshift, dshift);
    }
    
}
