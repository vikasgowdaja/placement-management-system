package day10;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Removing an element from the HashSet
        fruits.remove("Banana");

        // Iterating through the HashSet
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
