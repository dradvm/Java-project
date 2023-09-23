package javaeproject.dao;

import java.sql.*;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.Room;

public class RoomDAO {
    
    private Connection connection;
    
    public RoomDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    public ArrayList<Room> getRoomList() {
        ArrayList<Room> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from Room";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Room temp = new Room();
                temp.setRoomID(resultSet.getString(1));
                temp.setRoomType(resultSet.getString(2));
                temp.setRoomSpecialty(resultSet.getString(3));
                temp.setNumberOfPatients(resultSet.getInt(4));
                result.add(temp);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public Room getByID(String id) {
        Room result = new Room();
        try {
            String query = "select * from Room "
                + "where RoomID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                result.setRoomID(resultSet.getString(1));
                result.setRoomType(resultSet.getString(2));
                result.setRoomSpecialty(resultSet.getString(3));
                result.setNumberOfPatients(resultSet.getInt(4));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
