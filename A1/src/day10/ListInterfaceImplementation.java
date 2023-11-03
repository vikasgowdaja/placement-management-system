package day10;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceImplementation {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Updating an element in the list
        fruits.set(1, "Mango");

        // Removing an element from the list
        fruits.remove("Apple");

        // Accessing elements in the list
        String firstFruit = fruits.get(0);
        String lastFruit = fruits.get(fruits.size() - 1);

        // Iterating through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}