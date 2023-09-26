package javaeproject.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthRecord {
    private String recordID;
    private String patientID; // Thêm trường PatientID
    private String problem;
    private Date createDate;

    public HealthRecord() {}

    public HealthRecord(String recordID, String patientID, String problem, String createDateStr) {
        this.recordID = recordID;
        this.patientID = patientID; // Khởi tạo trường PatientID
        this.problem = problem;
        
        // Chuyển đổi chuỗi createDateStr sang kiểu Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
        try {
            Date createDate = dateFormat.parse(createDateStr);
            this.createDate = createDate;
        } catch (ParseException e) {
            // Xử lý ngoại lệ nếu có lỗi chuyển đổi
            e.printStackTrace();
            // Có thể thêm thông báo hoặc xử lý khác tùy vào yêu cầu của bạn
        }
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }
    
    public String getPatientID() {
        return patientID;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
