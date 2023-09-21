package javaeproject.model;

public class ShiftType {
    
    private String type;
    private int startTime;
    private int endTime;

    public ShiftType() {
    }
    
    public ShiftType(String type, int startTime, int endTime) {
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
