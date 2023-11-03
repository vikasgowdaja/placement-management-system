package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        // Sort the list in alphabetical order
        Collections.sort(fruitsList);

        // Display the sorted list using the "toString" method
        System.out.println("Sorted Fruits List: " + fruitsList.toString());
    }
}