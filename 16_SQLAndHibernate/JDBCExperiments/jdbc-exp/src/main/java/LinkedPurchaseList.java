import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "linked_purchase_list")
public class LinkedPurchaseList {

    @EmbeddedId
    private LinkedPurchaseListId id;

    public LinkedPurchaseList(LinkedPurchaseListId id) {
        this.id = id;
    }

    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Student studentId;
    @JoinColumn(name = "student_name", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Student studentName;
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Course courseId;

    public LinkedPurchaseListId getId() {
        return id;
    }

    public void setId(LinkedPurchaseListId id) {
        this.id = id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Student getStudentName() {
        return studentName;
    }
    public void setStudentName(Student studentName) {
        this.studentName = studentName;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @Embeddable
    public static class LinkedPurchaseListId implements Serializable {

        @Column(name = "student_id")
        private Integer studentId;
        @Column(name = "student_name")
        private String studentName;
        @Column(name = "course_id")
        private Integer courseId;

        public LinkedPurchaseListId() {
        }
        public LinkedPurchaseListId(Integer studentId, String studentName, Integer courseId) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.courseId = courseId;
        }
        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            LinkedPurchaseListId that = (LinkedPurchaseListId) obj;
            if (!studentId.equals(that.getStudentId())) return false;
            return courseId.equals(that.getCourseId());
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId, courseId);
        }
    }

}
