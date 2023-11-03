package day10;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOperations {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        // Adding elements to the sorted set
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Orange");

        // Accessing elements in the sorted set
        String firstElement = sortedSet.first();
        String lastElement = sortedSet.last();

        // Removing an element from the sorted set
        sortedSet.remove("Banana");

        // Iterating through the sorted set
        for (String fruit : sortedSet) {
            System.out.println(fruit);
        }
    }
}

