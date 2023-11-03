package day4;

class Student {
    String name;
    String USN;

    Student(String name, String USN) {
        this.name = name;
        this.USN = USN;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "ABC123");
        student1.printDetails();

        Student student2 = new Student("Jane Smith", "XYZ456");
        student2.printDetails();
    }
}