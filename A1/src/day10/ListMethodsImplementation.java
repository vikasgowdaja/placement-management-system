package day10;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsImplementation {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Adding elements to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Updating an element in the list
        colors.set(1, "Yellow");

        // Searching for an element in the list
        boolean containsBlue = colors.contains("Blue");

        // Removing an element from the list
        colors.remove("Red");

        // Accessing elements in the list
        String firstColor = colors.get(0);
        String lastColor = colors.get(colors.size() - 1);
    }
}