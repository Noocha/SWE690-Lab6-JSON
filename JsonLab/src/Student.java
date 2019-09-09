import java.util.Vector;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private double gpa;
    private String email;
    private Vector<String> advisors;

    public Student(int id, String firstname, String lastname, double gpa, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
        this.email = email;
        this.advisors = new Vector<String>(5);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vector<String> getAdvisor() {
        return advisors;
    }

    public void setAdvisor(Vector<String> advisor) {
        this.advisors = advisor;
    }

    public void  addAdvisor(String advisorName) {
        advisors.add(advisorName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gpa=" + gpa +
                ", email='" + email + '\'' +
                ", advisor=" + advisors +
                '}';
    }
}
