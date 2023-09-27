/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

/**
 *
 * @author DELL
 */
public class DoctorAndReceptionist {
    private String name;
    private String gender;
    private String position;
    private String currentDepartment;

    // Các getters và setters cho các thuộc tính

    public DoctorAndReceptionist(String name, String gender, String position, String currentDepartment) {
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.currentDepartment = currentDepartment;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public String getCurrentDepartment() {
        return currentDepartment;
    }
}

