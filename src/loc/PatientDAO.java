/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PatientDAO {
    private final Connection connection;

    public PatientDAO() {
        connection = ConnectionDB.getConnection();
    }

    public boolean addPatient(Patient patient) {
        if (connection != null) {
            PreparedStatement pstmt = null;
            try {
                String query = "INSERT INTO Patient (PatientID, PatientName, Gender, PatientPhone, PatientAddress, PatientDoB, Note) VALUES (?, ?, ?, ?, ?, ?, ?)";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patient.getPatientID());
                pstmt.setString(2, patient.getPatientName());
                pstmt.setString(3, patient.getPatientGender());
                pstmt.setString(4, patient.getPatientPhone());
                pstmt.setString(5, patient.getPatientAddress());
                java.sql.Date sqlDate = new java.sql.Date(patient.getPatientDoB().getTime());
                pstmt.setDate(6, sqlDate);
                pstmt.setString(7, patient.getNote());

                int rowsInserted = pstmt.executeUpdate();

                return rowsInserted > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public boolean updatePatient(Patient patient) {
        if (connection != null) {
            PreparedStatement pstmt = null;
            try {
                String query = "UPDATE Patient SET PatientName=?, Gender=?, PatientPhone=?, PatientAddress=?, PatientDoB=?, Note=? WHERE PatientID=?";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patient.getPatientName());
                pstmt.setString(2, patient.getPatientGender());
                pstmt.setString(3, patient.getPatientPhone());
                pstmt.setString(4, patient.getPatientAddress());
                java.sql.Date sqlDate = new java.sql.Date(patient.getPatientDoB().getTime());
                pstmt.setDate(5, sqlDate);
                pstmt.setString(6, patient.getNote());
                pstmt.setString(7, patient.getPatientID());

                int rowsUpdated = pstmt.executeUpdate();

                return rowsUpdated > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public boolean deletePatient(String patientID) {
        if (connection != null) {
            PreparedStatement pstmt = null;
            try {
                String query = "DELETE FROM Patient WHERE PatientID=?";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                int rowsDeleted = pstmt.executeUpdate();

                return rowsDeleted > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public Patient getPatientByID(String patientID) {
        if (connection != null) {
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;
            try {
                String query = "SELECT * FROM Patient WHERE PatientID=?";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    Patient patient = new Patient();
                    patient.setPatientID(resultSet.getString("PatientID"));
                    patient.setPatientName(resultSet.getString("PatientName"));
                    patient.setpatientGender(resultSet.getString("Gender"));
                    patient.setpatientPhone(resultSet.getString("PatientPhone"));
                    patient.setpatientAddress(resultSet.getString("PatientAddress"));
                    patient.setPatientDoB(resultSet.getDate("PatientDoB"));
                    patient.setNote(resultSet.getString("Note"));

                    return patient;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    public boolean isPatientExist(String patientID) {
        if (connection != null) {
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;
            try {
                String query = "SELECT COUNT(*) FROM Patient WHERE PatientID=?";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        if (connection != null) {
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;
            try {
                String query = "SELECT * FROM Patient";
                pstmt = connection.prepareStatement(query);
                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    Patient patient = new Patient();
                    patient.setPatientID(resultSet.getString("PatientID"));
                    patient.setPatientName(resultSet.getString("PatientName"));
                    patient.setpatientGender(resultSet.getString("Gender"));
                    patient.setpatientPhone(resultSet.getString("PatientPhone"));
                    patient.setpatientAddress(resultSet.getString("PatientAddress"));
                    patient.setPatientDoB(resultSet.getDate("PatientDoB"));
                    patient.setNote(resultSet.getString("Note"));
                    patients.add(patient);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return patients;
    }
    
}


