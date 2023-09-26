package loc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import loc.Doctor;
public class DoctorDAO {
    private final Connection connection;

    public DoctorDAO() {
        connection = ConnectionDB.getConnection();
    }

    public Doctor getInforDoctor(String doctorID) {
        Doctor doctorInfo = null;

        try {
            String sql = "SELECT * FROM Employee WHERE EmployeeID = ? AND Position IN ('Doctor', 'Department Head')";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, doctorID);

            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                // Lấy thông tin từ kết quả truy vấn
                String name = resultSet.getString("EmployeeName");
                String gender = resultSet.getString("Gender");
                String departmentID = resultSet.getString("DepartmentID");
                String position = resultSet.getString("Position");

                // Tạo đối tượng DoctorInfo
                doctorInfo = new Doctor(name, gender, departmentID, position);
            }

            // Đóng tài nguyên ResultSet và PreparedStatement, không đóng kết nối ở đây
            resultSet.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctorInfo;
    }
    public boolean updateDoctorPosition(String doctorID, String newPosition) {
    try {
        String sql = "UPDATE Employee SET Position = ? WHERE EmployeeID = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, newPosition);
        pstmt.setString(2, doctorID);

        int rowsAffected = pstmt.executeUpdate();
        // Đóng tài nguyên PreparedStatement
        pstmt.close();
        // Kiểm tra số dòng bị ảnh hưởng sau khi thực hiện cập nhật
        if (rowsAffected > 0) {
            return true; // Cập nhật thành công
        } else {
            return false; // Không có bản ghi nào được cập nhật
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Có lỗi xảy ra trong quá trình cập nhật
    }
}

}
