package day10;

import java.util.TreeSet;
import java.util.Set;

public class

 TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        // Removing an element from the TreeSet
        numbers.remove(5);

        // Accessing elements in the TreeSet (not directly supported, as sets are unordered)

        // Iterating through the TreeSet
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
