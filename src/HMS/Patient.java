package HMS;

public class Patient {

    private String name, id, Contact;

    public Patient() {
        this.name = "";
        this.id = "";
        this.Contact = "";
    }

    public Patient(String name, String id, String contact) {
        this.name = name;
        this.id = id;
        Contact = contact;
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

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}
