package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.DoctorAndReceptionist;

public class DoctorAndReceptionistDAO {
    private final Connection connection;

    public DoctorAndReceptionistDAO() {
        connection = ConnectionDB.getConnection();
    }

    public DoctorAndReceptionist getEmployeeInformation(String employeeID) {
        DoctorAndReceptionist employeeInfo = null;

        try {
            String sql = "SELECT * FROM Employee WHERE EmployeeID = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, employeeID);

            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("EmployeeName");
                String gender = resultSet.getString("Gender");
                String position = resultSet.getString("Position");
                String currentDepartment = resultSet.getString("DepartmentID");

                employeeInfo = new DoctorAndReceptionist(name, gender, position, currentDepartment);
            }

            resultSet.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeInfo;
    }
    public boolean updateDoctorPosition(String employeeID, String departmentID) {
    try {
        // Lấy thông tin về Position của nhân viên
        String getPositionSQL = "SELECT Position FROM Employee WHERE EmployeeID = ?";
        PreparedStatement getPositionStmt = connection.prepareStatement(getPositionSQL);
        getPositionStmt.setString(1, employeeID);

        ResultSet resultSet = getPositionStmt.executeQuery();
        if (resultSet.next()) {
            String currentPosition = resultSet.getString("Position");

            // Kiểm tra xem Position có khớp với DepartmentID không
            if (("Doctor".equals(currentPosition) && !"D3".equals(departmentID) && !"D4".equals(departmentID) && !"D5".equals(departmentID)) || 
                ("Receptionist".equals(currentPosition) && !"D1".equals(departmentID) && !"D2".equals(departmentID))) {
                // Nếu có lỗi, hiển thị thông báo lỗi tương ứng
                if ("Doctor".equals(currentPosition)) {
                    JOptionPane.showMessageDialog(null, "Cannot assign Doctor to Reception Department.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign Receptionist to Doctor Department.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                return false; // Trả về false để không tiếp tục cập nhật
            }
        }

        // Tiến hành cập nhật DepartmentID nếu không có lỗi
        String updateSQL = "UPDATE Employee SET DepartmentID = ? WHERE EmployeeID = ?";
        PreparedStatement updateStmt = connection.prepareStatement(updateSQL);
        updateStmt.setString(1, departmentID);
        updateStmt.setString(2, employeeID);

        int rowsAffected = updateStmt.executeUpdate();

        updateStmt.close();

        // Nếu có ít nhất một dòng bị ảnh hưởng (đã cập nhật thành công), trả về true
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Trả về false nếu có lỗi
    }
}
}
