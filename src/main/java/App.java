import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String args[]){

        Student student = new Student();
        student.setStudentId(1l);
        student.setStudentName("Ram Parsad");
        student.setStudentAddress("Bhaktapur");

        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.save(student);
    }
}
