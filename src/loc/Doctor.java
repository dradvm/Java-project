package loc;


public class Doctor {
    private String name;
    private String gender;
    private String departmentID;
    private String position;

    public Doctor(String name, String gender, String departmentID, String position) {
        this.name = name;
        this.gender = gender;
        this.departmentID = departmentID;
        this.position = position;
    }

    // Các phương thức getter và setter cho các thuộc tính

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
