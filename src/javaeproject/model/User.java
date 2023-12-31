package javaeproject.model;

import java.time.LocalDate;

public class User {
    
    private String employeeID;
    private String departmentID;
    private String employeeName;
    private String gender;
    private String position;
    private String address;
    private String employeePhone;
    private LocalDate employeeDoB;
    private String email;
    private String employeeSpecialty;
    private String username;
    private String password;
    
    public User() {
    }

    public User(String employeeID, String departmentID, String employeeName, String gender, String position, String address, String employeePhone, LocalDate employeeDoB, String email, String employeeSpecialty, String username, String password) {
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.employeeName = employeeName;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.employeePhone = employeePhone;
        this.employeeDoB = employeeDoB;
        this.email = email;
        this.employeeSpecialty = employeeSpecialty;
        this.username = username;
        this.password = password;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public LocalDate getEmployeeDoB() {
        return employeeDoB;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeSpecialty() {
        return employeeSpecialty;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public void setEmployeeDoB(LocalDate employeeDoB) {
        this.employeeDoB = employeeDoB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployeeSpecialty(String employeeSpecialty) {
        this.employeeSpecialty = employeeSpecialty;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
