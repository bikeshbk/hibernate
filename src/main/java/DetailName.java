import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetailName {

    @Column(name = "first_name")
    private String fname;

    @Column(name = "middle_name")
    private String mname;

    @Column(name = "last_name")
    private String lname;

    public DetailName() {
    }

    public DetailName(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "DetailName{" +
                "fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
