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
    private LocalDate date;
    private String type;
    private int startTime;
    private int endTime;

    public Shift() {
    }

    public Shift(String shiftID, String employeeID, String departmentID, String roomID, LocalDate date, String type, int startTime, int endTime) {
        this.shiftID = shiftID;
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.roomID = roomID;
        this.date = date;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
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

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    
    
}
