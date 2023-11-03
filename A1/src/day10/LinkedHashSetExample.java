package day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> colors = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Removing an element from the LinkedHashSet
        colors.remove("Green");

        // Iterating through the LinkedHashSet
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
