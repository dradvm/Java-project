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
public class ShiftRequest {
    private String requestID;
    private String employeeID;
    private String currentShiftID;
    private String desiredShiftID;
    private String details;
    private LocalDate date;
    private String status;

    public ShiftRequest() {
        
    }

    public ShiftRequest(String requestID, String employeeID, String currentShiftID, String desiredShiftID, String details, LocalDate date) {
        this.requestID = requestID;
        this.employeeID = employeeID;
        this.currentShiftID = currentShiftID;
        this.desiredShiftID = desiredShiftID;
        this.details = details;
        this.date = date;
        this.status = "Pending";
    }


    
    public String getRequestID() {
        return requestID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getCurrentShiftID() {
        return currentShiftID;
    }

    public String getDesiredShiftID() {
        return desiredShiftID;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setCurrentShiftID(String currentShiftID) {
        this.currentShiftID = currentShiftID;
    }

    public void setDesiredShiftID(String desiredShiftID) {
        this.desiredShiftID = desiredShiftID;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void changeStatus(boolean check) {
        if (check) {
            this.status = "Approved";
        }
        else {
            this.status = "Rejected";
        }
    }
    
}
