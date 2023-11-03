package day6;

//Patient Class
class Patient {
 // Attributes
 private String patientName;
 private int patientAge;
 private String doa;
 private String disease;

 // Parameterized Constructor
 public Patient(String patientName, int patientAge, String doa, String disease) {
     this.patientName = patientName;
     this.patientAge = patientAge;
     this.doa = doa;
     this.disease = disease;
 }

 // Method to display patient details
 public void patientDetails() {
     System.out.println("Patient Name: " + patientName);
     System.out.println("Patient Age: " + patientAge);
     System.out.println("Date of Arrival: " + doa);
     System.out.println("Disease: " + disease);
 }
}

//Information Class
class Information {
 // Attributes
 private int blockNo;
 private int floorNo;
 private int roomNo;
 private int bedNo;

 // Parameterized Constructor
 public Information(int blockNo, int floorNo, int roomNo, int bedNo) {
     this.blockNo = blockNo;
     this.floorNo = floorNo;
     this.roomNo = roomNo;
     this.bedNo = bedNo;
 }

 // Method to display information details
 public void informationDetails() {
     System.out.println("Block No: " + blockNo);
     System.out.println("Floor No: " + floorNo);
     System.out.println("Room No: " + roomNo);
     System.out.println("Bed No: " + bedNo);
 }
}

//Payment Class
class Payment {
 // Attributes
 private double admFees;
 private double regFees;
 private double balAmt;

 // Parameterized Constructor
 public Payment(double admFees, double regFees, double balAmt) {
     this.admFees = admFees;
     this.regFees = regFees;
     this.balAmt = balAmt;
 }

 // Method to display payment details
 public void paymentDetails() {
     System.out.println("Admission Fees: " + admFees);
     System.out.println("Registration Fees: " + regFees);
     System.out.println("Balance Amount: " + balAmt);
 }
}

//Main class to test the implementation
public class Main8 {
 public static void main(String[] args) {
     // Creating instances of the classes
     Patient patient1 = new Patient("John Doe", 35, "2023-05-15", "Malaria");
     Information info1 = new Information(1, 2, 101, 1);
     Payment payment1 = new Payment(5000.0, 2000.0, 3000.0);

     // Displaying patient details
     System.out.println("Patient Details:");
     patient1.patientDetails();

     // Displaying information details
     System.out.println("\nInformation Details:");
     info1.informationDetails();

     // Displaying payment details
     System.out.println("\nPayment Details:");
     payment1.paymentDetails();
 }
}
