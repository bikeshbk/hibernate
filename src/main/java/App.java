import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String args[]){

        Student student = new Student();
        DetailName dn = new DetailName();
        Laptop l = new Laptop();
        l.setLaptopName("DEll");
        l.getStudent().add(student);
        dn.setFname("Roman");
        dn.setMname("Kumar");
        dn.setLname("Shrestha");
        student.setStudentName(dn);
        student.setStudentAddress("Kathmandu");
        student.getLaptop().add(l);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(student);
        session.save(l);
//        student = (Student) session.get(Student.class, 1l);
        t.commit();
//        System.out.println(student);
    }
}
