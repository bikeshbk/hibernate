import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "laptop_name")
    private String laptopName;

    @ManyToMany
    private List<Student> student = new ArrayList<Student>();

    public Laptop() {
    }

    public Laptop(Long id, String laptopName, List<Student> student) {
        this.id = id;
        this.laptopName = laptopName;
        this.student = student;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", laptopName='" + laptopName + '\'' +
                ", student=" + student +
                '}';
    }
}
