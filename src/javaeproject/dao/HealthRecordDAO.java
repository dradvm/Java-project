/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import javaeproject.model.HealthRecord;
import javaeproject.model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javaeproject.connection.ConnectionDB;
/**
 *
 * @author DELL
 */


public class HealthRecordDAO {
    private final Connection connection;

    public HealthRecordDAO() {
        connection = ConnectionDB.getConnection();
    }

    public boolean addHealthRecord(String recordID, String patientID, String problem) {
    if (connection != null) {
        PreparedStatement pstmt = null;
        try {
            // Kiểm tra xem patientID có tồn tại trong bảng Patient không
            if (!CheckPatientExist(patientID)) {
                JOptionPane.showMessageDialog(null, "Patient with ID " + patientID + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Thêm bản ghi mới vào cơ sở dữ liệu với `recordID`
            String insertQuery = "INSERT INTO HealthRecord (RecordID, PatientID, Problem, CreateDate) VALUES (?, ?, ?, GETDATE())";
            pstmt = connection.prepareStatement(insertQuery);
            pstmt.setString(1, recordID);
            pstmt.setString(2, patientID);
            pstmt.setString(3, problem);

            int rowsInserted = pstmt.executeUpdate();
            pstmt.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return false;
}




    public boolean updateHealthRecord(String recordID, String problem, String createDate) {
    if (connection != null) {
        PreparedStatement pstmt = null;
        try {
            String query = "UPDATE HealthRecord SET Problem=?, CreateDate=? WHERE RecordID=?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, problem);
            pstmt.setString(2, createDate);
            pstmt.setString(3, recordID);

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
                String query = "DELETE FROM HealthRecord WHERE RecordID=?";
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

    public boolean CheckPatientExist(String patientID) throws SQLException {
        if (connection != null) {
            System.out.println("Checking connection status before executing isPatientExist: " + !connection.isClosed());
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
            } 
        }
        return false;
    }
    public String getHealthRecordByRecordID(String recordID) {
    if (connection != null) {
        try {
            // Check if the record exists
            if (!CheckHealthRecordExist(recordID)) {
                JOptionPane.showMessageDialog(null, "Health record with RecordID " + recordID + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            String query = "SELECT Problem FROM HealthRecord WHERE RecordID=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, recordID);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                String healthRecord = resultSet.getString("Problem");
                resultSet.close();
                pstmt.close();
                return healthRecord;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}

public String getCreateDateByRecordID(String recordID) {
    if (connection != null) {
        try {
            // Check if the record exists
            if (!CheckHealthRecordExist(recordID)) {
                JOptionPane.showMessageDialog(null, "Health record with RecordID " + recordID + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            String query = "SELECT CreateDate FROM HealthRecord WHERE RecordID=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, recordID);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                String createDate = resultSet.getString("CreateDate");
                resultSet.close();
                pstmt.close();
                return createDate;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}


    public int countOldRecordsByPatientID(String patientID) {
    int count = 0;
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return count;
}
    public String getPatientIDByRecordID(String recordID) {
    if (connection != null) {
        try {
            // Kiểm tra xem bản ghi tồn tại hay không
            if (!CheckHealthRecordExist(recordID)) {
                JOptionPane.showMessageDialog(null, "Health record with RecordID " + recordID + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            String query = "SELECT PatientID FROM HealthRecord WHERE RecordID=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, recordID);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                String patientID = resultSet.getString("PatientID");
                resultSet.close();
                pstmt.close();
                return patientID;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}
    public List<HealthRecord> getAllHealthRecords() {
    List<HealthRecord> healthRecords = new ArrayList<>();
    if (connection != null) {
        try {
            String query = "SELECT * FROM HealthRecord";
            PreparedStatement pstmt = connection.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();
            
            while (resultSet.next()) {
                String recordID = resultSet.getString("RecordID");
                String patientID = resultSet.getString("PatientID");
                String problem = resultSet.getString("Problem");
                String createDate = resultSet.getString("CreateDate");
                
                // Tạo một đối tượng HealthRecord từ dữ liệu và thêm vào danh sách
                Patient patient = new Patient();
                HealthRecord healthRecord = new HealthRecord(recordID, patientID, problem, createDate);
                healthRecords.add(healthRecord);
            }
            
            resultSet.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return healthRecords;
}
    public List<HealthRecord> getHealthRecordsByPatientID(String patientID) {
    List<HealthRecord> healthRecords = new ArrayList<>();
    if (connection != null) {
        try {
            String query = "SELECT RecordID, Problem, CreateDate FROM HealthRecord WHERE PatientID=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, patientID);
            ResultSet resultSet = pstmt.executeQuery();
            
            while (resultSet.next()) {
                String recordID = resultSet.getString("RecordID");
                String problem = resultSet.getString("Problem");
                String createDate = resultSet.getString("CreateDate");
                
                // Tạo một đối tượng HealthRecord từ dữ liệu và thêm vào danh sách
                HealthRecord healthRecord = new HealthRecord(recordID, patientID, problem, createDate); // Chú ý truyền null vào cho Patient, vì ta không cần thông tin Patient ở đây
                healthRecords.add(healthRecord);
            }
            
            resultSet.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return healthRecords;
}
    public boolean checkRecordIDExists(String recordID) {
    if (connection != null) {
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT COUNT(*) FROM HealthRecord WHERE RecordID=?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, recordID);
            resultSet = pstmt.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            // Nếu count > 0, tức là recordID đã tồn tại
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Nếu có lỗi hoặc không tìm thấy, trả về false
    return false;
}
    public boolean checkPatientIDExists(String patientID) {
    if (connection != null) {
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT COUNT(*) FROM HealthRecord WHERE PatientID=?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, patientID);
            resultSet = pstmt.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            // Nếu count > 0, tức là PatientID đã tồn tại
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Nếu có lỗi hoặc không tìm thấy, trả về false
    return false;
}

public boolean CheckHealthRecordExist(String RecordID) throws SQLException {
        if (connection != null) {
            System.out.println("Checking connection status before executing isPatientExist: " + !connection.isClosed());
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;
            try {
                String query = "SELECT COUNT(*) FROM HealthRecord WHERE RecordID=?";
                pstmt = connection.prepareStatement(query);
                pstmt.setString(1, RecordID);

                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } 
        }
        return false;
    }

}



