import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class PurchaseList {

    @EmbeddedId
    PurchaseListId id;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "course_id")
    private Integer courseId;

    private int price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public PurchaseList() {
    }

    public PurchaseListId getId() {
        return id;
    }

    public void setId(PurchaseListId id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public String toString() {
        return "PurchaseList {" +
                "student_id - " + studentId +
                ", student_name - " + id.getStudentName() +
                ", course_id - " + courseId +
                ", course_name - " + id.getCourseName() +
                ", price - " + getPrice() + " руб." +
                ", subscription_date - " + subscriptionDate +
                "}\n";
    }
}

@Embeddable
class PurchaseListId implements Serializable {

    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course_name")
    private String courseName;

    private PurchaseListId() {
    }
    public PurchaseListId(String studentName, String courseName){
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PurchaseListId that = (PurchaseListId) obj;
        if (studentName.equals(that.studentName)) return false;
        return courseName.equals(that.courseName);
    }
    public int hashCode() {
        return Objects.hash(studentName, courseName);
    }
}