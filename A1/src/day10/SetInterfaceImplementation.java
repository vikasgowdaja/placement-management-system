package day10;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceImplementation {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        // Adding elements to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Removing an element from the set
        colors.remove("Red");

        // Accessing elements in the set (not directly supported, as sets are unordered)

        // Iterating through the set
        for (String color : colors) {
            System.out.println(color);
        }
    }
}