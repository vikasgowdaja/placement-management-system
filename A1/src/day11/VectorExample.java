package day11;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> namesVector = new Vector<>();
        namesVector.add("John");
        namesVector.add("Alice");
        namesVector.add("Bob");

        // Display the names using the "toString" method
        System.out.println("Names: " + namesVector.toString());

        // Print the size of the Vector using the "size" method
        System.out.println("Size of Vector: " + namesVector.size());
    }
}

