/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Shift {
    
    private String shiftID;
    private String employeeID;
    private String departmentID;
    private String roomID;
    private String type;
    private LocalDate date;
    
    public Shift() {
    }

    public Shift(String shiftID, String employeeID, String departmentID, String roomID, String type, LocalDate date) {
        this.shiftID = shiftID;
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.roomID = roomID;
        this.type = type;
        this.date = date;
    }

    public String getShiftID() {
        return shiftID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getRoomID() {
        return roomID;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void setShiftID(String shiftID) {
        this.shiftID = shiftID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }
}
