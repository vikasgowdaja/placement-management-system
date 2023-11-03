package day6;



class Patient1 {
    private String patientName;
    private int patientAge;
    private String doa;
    private String disease;

    public Patient1(String patientName, int patientAge, String doa, String disease) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
    }

    public void patientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Date of Arrival: " + doa);
        System.out.println("Disease: " + disease);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Patient1 patient = new Patient1("John Doe", 35, "2023-07-16", "SARS-COVID-19");
        patient.patientDetails();
    }
}