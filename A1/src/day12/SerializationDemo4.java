package day12;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationDemo4 {
    public static void main(String[] args) {
        // Create an object
        Person person = new Person("John Doe", 30);

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\vikas\\OneDrive\\Desktop\\Java Basics\\data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Vikas Object has been serialized to data.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}