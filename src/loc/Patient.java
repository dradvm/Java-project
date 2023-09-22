/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loc;

import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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

//    public boolean addPatient() {
//        Connection conn = DatabaseConnection.connectToDatabase();
//        if (conn != null) {
//            try {
//                String query = "INSERT INTO Patient (PatientID, PatientName, Gender, PatientPhone, PatientAddress, PatientDoB, Note) VALUES (?, ?, ?, ?, ?, ?, ?)";
//                PreparedStatement pstmt = conn.prepareStatement(query);
//                pstmt.setString(1, this.getPatientID());
//                pstmt.setString(2, this.getPatientName());
//                pstmt.setString(3, this.getPatientGender());
//                pstmt.setString(4, this.getPatientPhone());
//                pstmt.setString(5, this.getPatientAddress());
//                java.sql.Date sqlDate = new java.sql.Date(this.getPatientDoB().getTime());
//                pstmt.setDate(6, sqlDate);
//
//                pstmt.setString(7, this.getNote());
//
//                int rowsInserted = pstmt.executeUpdate();
//                pstmt.close();
//                conn.close();
//
//                return rowsInserted > 0;
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }
//    public boolean updatePatient() {
//    Connection conn = DatabaseConnection.connectToDatabase();
//    if (conn != null) {
//        try {
//            String query = "UPDATE Patient SET PatientName=?, Gender=?, PatientPhone=?, PatientAddress=?, PatientDoB=?, Note=? WHERE PatientID=?";
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.setString(1, this.getPatientName());
//            pstmt.setString(2, this.getPatientGender());
//            pstmt.setString(3, this.getPatientPhone());
//            pstmt.setString(4, this.getPatientAddress());
//            java.sql.Date sqlDate = new java.sql.Date(this.getPatientDoB().getTime());
//            pstmt.setDate(5, sqlDate);
//            pstmt.setString(6, this.getNote());
//            pstmt.setString(7, this.getPatientID());
//
//            int rowsUpdated = pstmt.executeUpdate();
//            pstmt.close();
//            conn.close();
//
//            return rowsUpdated > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    return false;
//}
//
//public boolean deletePatient() {
//    Connection conn = DatabaseConnection.connectToDatabase();
//    if (conn != null) {
//        try {
//            String query = "DELETE FROM Patient WHERE PatientID=?";
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.setString(1, this.getPatientID());
//
//            int rowsDeleted = pstmt.executeUpdate();
//            pstmt.close();
//            conn.close();
//
//            return rowsDeleted > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    return false;
//}
//
//public Patient getPatientByID(String patientID) {
//    Connection conn = DatabaseConnection.connectToDatabase();
//    if (conn != null) {
//        try {
//            String query = "SELECT * FROM Patient WHERE PatientID=?";
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.setString(1, patientID);
//
//            ResultSet resultSet = pstmt.executeQuery();
//            if (resultSet.next()) {
//                Patient patient = new Patient();
//                patient.setPatientID(resultSet.getString("PatientID"));
//                patient.setPatientName(resultSet.getString("PatientName"));
//                patient.setpatientGender(resultSet.getString("Gender"));
//                patient.setpatientPhone(resultSet.getString("PatientPhone"));
//                patient.setpatientAddress(resultSet.getString("PatientAddress"));
//                patient.setPatientDoB(resultSet.getDate("PatientDoB"));
//                patient.setNote(resultSet.getString("Note"));
//
//                resultSet.close();
//                pstmt.close();
//                conn.close();
//
//                return patient;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    return null;
//}
//
//
//    public static void main(String[] args) {
//        
//        Patient patient = new Patient();
//
//        
//        patient.setPatientID("P001");
//        patient.setPatientName("John Doe");
//        patient.setpatientGender("Male");
//        patient.setpatientPhone("1234567890");
//        patient.setpatientAddress("123 Main Street");
//        patient.setPatientDoB(new Date()); // Thay thế Date() bằng ngày thực tế
//        patient.setNote("Regular checkup");
//
//        
//        boolean added = patient.addPatient();
//        if (added) {
//            System.out.println("Patient added successfully.");
//        } else {
//            System.out.println("Failed to add patient.");
//        }
//
//        
//        patient.setpatientPhone("9876543210");
//        boolean updated = patient.updatePatient();
//        if (updated) {
//            System.out.println("Patient updated successfully.");
//        } else {
//            System.out.println("Failed to update patient.");
//        }
//
//        
//        boolean deleted = patient.deletePatient();
//        if (deleted) {
//            System.out.println("Patient deleted successfully.");
//        } else {
//            System.out.println("Failed to delete patient.");
//        }
//    }
}


