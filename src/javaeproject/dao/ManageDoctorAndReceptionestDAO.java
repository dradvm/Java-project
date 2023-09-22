package javaeproject.dao;

import java.sql.*;
import javaeproject.connection.*;
import javaeproject.model.*;

public class ManageDoctorAndReceptionestDAO {
    
    //Att
    private Connection con;

    
    //Cons init DAO
    public ManageDoctorAndReceptionestDAO () {
        
        con = ConnectionDB.getConnection();
        
    }
    
    
    //SetStatement Method (Done)
    public void setStatement (PreparedStatement statement, ManageDocterAndReceptionest employee) throws SQLException {
        
        statement.setString(1, getNewEmployeeID());
        statement.setString(2, employee.getDepartmentID());
        statement.setString(3, employee.getEmployeeName());
        statement.setString(4, employee.getGender());
        statement.setString(5, employee.getPosition());
        statement.setString(6, employee.getAddress());
        statement.setString(7, employee.getEmployeePhone());
        statement.setString(8, employee.getEmployeeDoB().toString());
        statement.setString(9, employee.getEmail());
        statement.setString(10, employee.getEmployeeSpecialty());
        statement.setString(11, employee.getUsername());
        statement.setString(12, employee.getPassword());
        
    }
    
    
    //GetNewEmployeeID (Done)
    public String getNewEmployeeID () {
        
        try {
            
            Statement statement = con.createStatement();
            
            String query = "select top 1 EmployeeID "
                + "from [Employee] "
                + "where (select len(EmployeeID)) = (select max(len(EmployeeID)) from [Employee]) "
                + "order by EmployeeID desc";
            
            ResultSet result = statement.executeQuery(query);
            
            int maxEmployeeID = -1;
            
            while (result.next()) {
                
                maxEmployeeID = Integer.parseInt(result.getString(1).split("S")[1]);
                
            }
            
            if (maxEmployeeID != -1) {
                
                return "S" + (maxEmployeeID + 1);
                
            }
            
        }
        
        catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return null;
        
    }
    
    
    //Add Method
    public void addEmployee (ManageDocterAndReceptionest employee) throws SQLException {
        
        String sql = "Insert Into Employee Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        setStatement(statement, employee);
        statement.executeUpdate();
    
    }
    
}