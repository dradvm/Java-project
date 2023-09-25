/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    private void setHoliday(Holiday holiday, ResultSet rs) throws SQLException{
        holiday.setHolidayID(rs.getString(1));
        holiday.setHolidayName(rs.getString(2));
        String[] myDate = rs.getString(3).split("-");
        holiday.setStartDate(LocalDate.of(Integer.parseInt(myDate[0]), Integer.parseInt(myDate[1]), Integer.parseInt(myDate[2])));
        String[] myDate2 = rs.getString(4).split("-");
        holiday.setEndDate(LocalDate.of(Integer.parseInt(myDate2[0]), Integer.parseInt(myDate2[1]), Integer.parseInt(myDate2[2])));
        holiday.setDescription(rs.getString(5));
    }

}
