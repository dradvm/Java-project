/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loc;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */


public class HealthRecordDAO {
    private final Connection connection;

    public HealthRecordDAO() {
        connection = ConnectionDB.getConnection();
    }

    public boolean addHealthRecord(String patientID, String problem) {
        if (connection != null) {
            try {
                if (!isPatientExist(patientID)) {
                    System.err.println("Patient with ID " + patientID + " does not exist.");
                    return false;
                }

                String query = "INSERT INTO HealthRecord (PatientID, Problem) VALUES (?, ?)";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);
                pstmt.setString(2, problem);

                int rowsInserted = pstmt.executeUpdate();
                pstmt.close();

                return rowsInserted > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean updateHealthRecord(String patientID, String problem) {
        if (connection != null) {
            try {
                // Kiểm tra xem bệnh nhân có tồn tại hay không
                if (!isPatientExist(patientID)) {
                    // Hiển thị dialog lỗi nếu bệnh nhân không tồn tại
                    System.err.println("Patient with ID " + patientID + " does not exist.");
                    return false;
                }

                String query = "UPDATE HealthRecord SET Problem=? WHERE PatientID=?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, problem);
                pstmt.setString(2, patientID);

                int rowsUpdated = pstmt.executeUpdate();
                pstmt.close();

                return rowsUpdated > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean deleteHealthRecord(String patientID) {
        if (connection != null) {
            try {
                String query = "DELETE FROM HealthRecord WHERE PatientID=?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                int rowsDeleted = pstmt.executeUpdate();
                pstmt.close();

                return rowsDeleted > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean isPatientExist(String patientID) {
        if (connection != null) {
            try {
                String query = "SELECT COUNT(*) FROM Patient WHERE PatientID=?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                ResultSet resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    resultSet.close();
                    pstmt.close();

                    return count > 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public String getProblemByPatientID(String patientID) {
        if (connection != null) {
            try {
                // Kiểm tra xem bệnh nhân có tồn tại hay không
                if (!isPatientExist(patientID)) {
                    // Hiển thị dialog lỗi nếu bệnh nhân không tồn tại
                    JOptionPane.showMessageDialog(null, "Patient with ID " + patientID + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

                String query = "SELECT Problem FROM HealthRecord WHERE PatientID=?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, patientID);

                ResultSet resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    String problem = resultSet.getString("Problem");
                    resultSet.close();
                    pstmt.close();

                    // Hiển thị thông tin Problem trên giao diện
                    JOptionPane.showMessageDialog(null, "Problem: " + problem, "Health Record", JOptionPane.INFORMATION_MESSAGE);

                    return problem;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public int countOldRecordsByPatientID(String patientID) {
    int count = 0;
    Connection connection = ConnectionDB.getConnection();
    if (connection != null) {
        try {
            String query = "SELECT COUNT(*) FROM HealthRecord WHERE PatientID=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, patientID);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }

            resultSet.close();
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return count;
}

}

