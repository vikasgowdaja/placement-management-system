package day4;

class Student1 {
    String name;
    String USN;
    private int marks;

    Student1(String name, String USN) {
        this.name = name;
        this.USN = USN;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks

(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("John Doe", "ABC123");
        student1.setMarks(85);
        student1.printDetails();

        Student1 student2 = new Student1("Jane Smith", "XYZ456");
        student2.setMarks(95);
        student2.printDetails();

        // Invalid marks example
        Student1 student3 = new Student1("Invalid", "Invalid");
        student3.setMarks(120);
        student3.printDetails();
    }
}
