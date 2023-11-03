//package day12;
//
//import java.io.*;
//
//class Student implements Serializable {
//    private String name;
//    private int rollNumber;
//    private transient String password; // Using transient to demonstrate transient fields
//
//    public Student(String name, int rollNumber, String password) {
//        this.name = name;
//        this.rollNumber = rollNumber;
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNumber=" + rollNumber +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}
//
//public class SerializationDemo {
//    public static void main(String[] args) {
//        // Create an object of the Student class
//        Student student = new Student("John Doe", 12345, "mysecretpassword");
//
//        // Serialize the object to a file
//        try (FileOutputStream fileOut = new FileOutputStream("data.ser");
//             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//
//            out.writeObject(student);
//            System.out.println("Student object serialized successfully.");
//
//        } catch (IOException e) {
//            System.out.println("Error during serialization: " + e.getMessage());
//        }
//
//        // Deserialize the object from the file
//        try (FileInputStream fileIn = new FileInputStream("data.ser");
//             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//
//            Student deserializedStudent = (Student) in.readObject();
//            System.out.println("Student object deserialized successfully.");
//            System.out.println("Deserialized Student: " + deserializedStudent);
//
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Error during deserialization: " + e.getMessage());
//        }
//    }
//}
