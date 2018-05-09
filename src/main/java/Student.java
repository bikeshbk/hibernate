import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long studentId;

    @Column(name = "student_name")
    private DetailName studentName;

    @Column(name = "student_address")
    private String studentAddress;

    @ManyToMany(mappedBy = "student")
    private List<Laptop> laptop = new ArrayList<Laptop>();

    public Student() {
    }

    public Student(Long studentId, DetailName studentName, String studentAddress, List<Laptop> laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.laptop = laptop;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public DetailName getStudentName() {
        return studentName;
    }

    public void setStudentName(DetailName studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName=" + studentName +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
