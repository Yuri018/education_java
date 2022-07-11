import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(name = "registration_date")
    private Date registrationDate;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<Subscription> subscriptionList;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(Set<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", name= " + name + '\'' +
                ", age= " + age +
                ", registrationDate= " + registrationDate +
                "}\n";
    }
}
