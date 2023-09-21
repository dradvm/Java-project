package javaeproject.dao;

import java.sql.*;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.ShiftType;

public class ShiftTypeDAO {
    
    private final Connection connection;
    
    public ShiftTypeDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public ArrayList<ShiftType> getTypeList() {
        ArrayList<ShiftType> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from ShiftType";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                ShiftType temp = new ShiftType();
                temp.setType(resultSet.getString(1));
                temp.setStartTime(resultSet.getInt(2));
                temp.setEndTime(resultSet.getInt(3));
                result.add(temp);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
