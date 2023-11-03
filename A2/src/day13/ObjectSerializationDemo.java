package day13;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Serialize the object to a file named "data.ser"
        serializeObject(person, "data.ser");

        // Deserialize the object from the file and retrieve it
        Person deserializedPerson = deserializeObject("data.ser");

        // Display the contents of the deserialized object
        if (deserializedPerson != null) {
            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }
    }

    // Method to serialize an object and save it to a file
    private static void serializeObject(Object obj, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
            System.out.println("Object serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize an object from a file
    private static Person deserializeObject(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Person person = (Person) objectIn.readObject();
            System.out.println("Object deserialized from " + fileName);
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
