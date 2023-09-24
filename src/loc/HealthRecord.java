/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loc;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class HealthRecord {
    private String recordID;
    private String problem;
    private Patient patient;
    private Date createDate;

    public HealthRecord(String recordID, String problem, Patient patient) {
        this.recordID = recordID;
        this.problem = problem;
        this.patient = patient; 
    }


    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
}
