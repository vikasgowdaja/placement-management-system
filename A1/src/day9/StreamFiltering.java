package day9;

import java.util.Arrays;
import java.util.List;

public class StreamFiltering {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "orange", "kiwi");

        // Filtering elements starting with "a"
        List<String> filteredFruits = fruits.stream()
                                            .filter(fruit -> fruit.startsWith("a"))
                                            .toList();

        System.out.println("Filtered Fruits: " + filteredFruits); // Output: [apple]
    }
}
