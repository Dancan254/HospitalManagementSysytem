package HMS;

public class Checkup {
    private Doctor doctor;
    private Patient patient;
    private int priority;
    private String recommendation, date;

    public Checkup(Doctor doctor, Patient patient, int priority, String recommendation, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.priority = priority;
        this.recommendation = recommendation;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public int getPriority() {
        return priority;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Checkup{" +
                "doctor=" + doctor.toString() +
                ", patient=" + patient.toString() +
                ", priority=" + priority +
                ", recommendation='" + recommendation + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
