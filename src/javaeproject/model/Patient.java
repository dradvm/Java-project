/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.util.*;

public class Patient {

    private String patientID;
    private String patientName;
    private String gender;
    private String patientPhone;
    private String patientAddress;
    private Date patientDoB;
    private String note;
    
    public Patient() {
    }

    public Patient(String patientID, String patientName, String gender, String patientPhone,
            String patientAddress, Date patientDoB, String note) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.gender = gender;
        this.patientPhone = patientPhone;
        this.patientAddress = patientAddress;
        this.patientDoB = patientDoB;
        this.note = note;
    }
    

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getPatientDoB() {
        return patientDoB;
    }

    public void setPatientDoB(Date patientDoB) {
        this.patientDoB = patientDoB;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setpatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setpatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientGender() {
        return gender;
    }

    public void setpatientGender(String gender) {
        this.gender = gender;
    }
}


