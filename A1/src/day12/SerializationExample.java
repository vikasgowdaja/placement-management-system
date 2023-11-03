package day12;

import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters (not necessary for serialization demo)
}

public class SerializationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 25);

        // Serialize the object to a file named "data.ser"
        try (FileOutputStream fileOut = new FileOutputStream("data.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(student);
            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
