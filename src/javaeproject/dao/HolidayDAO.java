/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javaeproject.connection.ConnectionDB;
import javaeproject.model.Holiday;
import javaeproject.model.ShiftRequest;

/**
 *
 * @author DELL
 */
public class HolidayDAO {
    private Connection connection;
    
    
    public HolidayDAO() {
        connection = ConnectionDB.getConnection();
    }
    
    
    public ArrayList<Holiday> getListHoliday() {
        ArrayList<Holiday> listHoliday = new ArrayList<>();
        String sql = "select * from Holiday order by StartDate";
        Holiday holiday = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                holiday = new Holiday();
                setHoliday(holiday, rs);
                listHoliday.add(holiday);
            }

        } catch (SQLException e) {

            System.out.println("Error");
        }
        return listHoliday;
    }
    public void add(Holiday holiday){
        String sql = "INSERT INTO Holiday VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            setStatement(statement, holiday);
            statement.executeUpdate();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
        
    }
    
    public void update(Holiday holiday) {
        String sql = "Update Holiday set HolidayName = ?, StartDate = ?, EndDate = ?, Description = ? where HolidayID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, holiday.getHolidayName());
            statement.setString(2, holiday.getStartDate().toString());
            statement.setString(3, holiday.getEndDate().toString());
            statement.setString(4, holiday.getDescription());
            statement.setString(5, holiday.getHolidayID());
            statement.executeUpdate();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
    
    public void delete(Holiday holiday) {
        String sql = "delete from holiday where HolidayID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, holiday.getHolidayID());
            
            statement.executeUpdate();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
    
    public String getNewID() {
        try {
            Statement statement = connection.createStatement();
            String query = "select top 1 HolidayID from [Holiday] "
                + "where (select len(HolidayID)) = (select max(len(HolidayID)) from [Holiday]) "
                + "order by HolidayID desc";
            ResultSet result = statement.executeQuery(query);
            int maxHolidayID = 0;
            while (result.next()) {
                maxHolidayID = Integer.parseInt(result.getString(1).split("H")[1]);
            }
            return "H" + (maxHolidayID + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    private void setHoliday(Holiday holiday, ResultSet rs) throws SQLException{
        holiday.setHolidayID(rs.getString(1));
        holiday.setHolidayName(rs.getString(2));
        String[] myDate = rs.getString(3).split("-");
        holiday.setStartDate(LocalDate.of(Integer.parseInt(myDate[0]), Integer.parseInt(myDate[1]), Integer.parseInt(myDate[2])));
        String[] myDate2 = rs.getString(4).split("-");
        holiday.setEndDate(LocalDate.of(Integer.parseInt(myDate2[0]), Integer.parseInt(myDate2[1]), Integer.parseInt(myDate2[2])));
        holiday.setDescription(rs.getString(5));
    }

    private void setStatement(PreparedStatement statement, Holiday holiday) throws SQLException{
        statement.setString(1, holiday.getHolidayID());
        statement.setString(2, holiday.getHolidayName());
        statement.setString(3, holiday.getStartDate().toString());
        statement.setString(4, holiday.getEndDate().toString());
        statement.setString(5, holiday.getDescription());
    }
    
}
