package HMS;

public class Doctor {
    private String name, id, Contact, Speciality;
    private double fees;

    public Doctor() {
    }

    public Doctor(String name, String id, String contact, String Speciality, double fees) {
        this.name = name;
        this.id = id;
        Contact = contact;
        this.Speciality = Speciality;
        this.fees = fees;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Speciality='" + Speciality + '\'' +
                ", fees=" + fees +
                '}';
    }
}
