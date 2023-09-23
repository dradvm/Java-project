package javaeproject.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.Room;
import javaeproject.model.Shift;
import javaeproject.model.User;

public class EmployeeDAO {
    
    private final Connection connection;
    
    public EmployeeDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    private void setUser(User user, ResultSet result) {
        try {
            user.setEmployeeID(result.getString(1));
            user.setDepartmentID(result.getString(2));
            user.setEmployeeName(result.getString(3));
            user.setGender(result.getString(4));
            user.setPosition(result.getString(5));
            user.setAddress(result.getString(6));
            user.setEmployeePhone(result.getString(7));
            String[] date = result.getString(8).split("-");
            user.setEmployeeDoB(LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
            user.setEmail(result.getString(9));
            user.setEmployeeSpecialty(result.getString(10));
            user.setUsername(result.getString(11));
            user.setPassword(result.getString(12));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<User> getAssignableEmployeeList(Shift shift, Room room) {
        ArrayList<User> result = new ArrayList<>();
        try {
            String query;
            PreparedStatement statement;
            if (shift.getType().equals("Fulltime")) {
                query = "select * from Employee "
                    + "where EmployeeID not in (select EmployeeID from [Shift] where [Date] = ? and EmployeeID is not null) "
                    + "and EmployeeSpecialty = ? "
                    + "and DepartmentID = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, shift.getDate().toString());
                statement.setString(2, room.getRoomSpecialty());
                statement.setString(3, shift.getDepartmentID());
            }
            else {
                query = "select * from Employee "
                    + "where EmployeeID not in (select EmployeeID from [Shift] where [Date] = ? and Type = ? and EmployeeID is not null) "
                    + "and EmployeeSpecialty = ? "
                    + "and DepartmentID = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, shift.getDate().toString());
                statement.setString(2, shift.getType());
                statement.setString(3, room.getRoomSpecialty());
                statement.setString(4, shift.getDepartmentID());
            }
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User temp = new User();
                setUser(temp, resultSet);
                result.add(temp);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
