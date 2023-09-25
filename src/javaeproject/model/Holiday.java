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
public class Holiday {
    private String holidayID;
    private String holidayName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    public Holiday() {
    }

    public Holiday(String holidayID, String holidayName, LocalDate startDate, LocalDate endDate, String description) {
        this.holidayID = holidayID;
        this.holidayName = holidayName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getHolidayID() {
        return holidayID;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setHolidayID(String holidayID) {
        this.holidayID = holidayID;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
