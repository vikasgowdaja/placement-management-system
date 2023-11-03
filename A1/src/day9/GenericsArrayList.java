package day9;

import java.util.ArrayList;
import java.util.List;

public class GenericsArrayList {
    public static void main(String[] args) {
        // Creating a generic ArrayList of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Generics");

        // Creating a generic ArrayList of Integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Printing the elements of the lists
        System.out.println("Strings: " + stringList);
        System.out.println("Integers: " + integerList);
    }
}
