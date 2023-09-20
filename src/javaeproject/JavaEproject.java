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
import javaeproject.gui.*;
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
//        MenuGUI test = new MenuGUI(new User());
//        ShiftRequestDAO shiftRequestDAO = new ShiftRequestDAO();
//        ShiftDAO shiftDAO = new ShiftDAO();
//        LoginDAO userDAO = new LoginDAO();
        TestGUI test = new TestGUI();
        //LoginGUI myApp = new LoginGUI();
    }
    
}
