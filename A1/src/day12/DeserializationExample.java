//package day12;
//
//import java.io.*;
//
//class Student implements Serializable {
//    private String name;
//    private int age;
//    
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    
//    // Getters and setters (not necessary for serialization demo)
//}
//
//public class DeserializationExample {
//    public static void main(String[] args) {
//        // Deserialize the object from the file "data.ser"
//        try (FileInputStream fileIn = new FileInputStream("data.ser");
//             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
//
//            Student deserializedStudent = (Student) objectIn.readObject();
//            System.out.println("Deserialized Object Contents:");
////            System.out.println("Name: " + deserializedStudent.getName());
////            System.out.println("Age: " + deserializedStudent.getAge());
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
