import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javaeproject.model.Patient;

public class HealthRecord {
    private String recordID;
    private String problem;
    private Patient patient;
    private Date createDate;

    public HealthRecord() {}

    public HealthRecord(String recordID, String problem, Patient patient, String createDateStr) {
        this.recordID = recordID;
        this.problem = problem;
        this.patient = patient;
        
        // Chuyển đổi chuỗi createDateStr sang kiểu Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
        try {
            Date createDate = dateFormat.parse(createDateStr);
            this.createDate = createDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
