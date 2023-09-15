/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

/**
 *
 * @author Voke
 */
public class Room {
    
    private String roomID;
    private String roomType;
    private String roomSpecialty;
    private int numberOfPatients;

    public Room() {
    }

    public Room(String roomID, String roomType, String roomSpecialty, int numberOfPatients) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomSpecialty = roomSpecialty;
        this.numberOfPatients = numberOfPatients;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomSpecialty() {
        return roomSpecialty;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomSpecialty(String roomSpecialty) {
        this.roomSpecialty = roomSpecialty;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }
}
