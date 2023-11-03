package day11;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("John", 25);
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 28);

        // Retrieve and print the age of Alice
        int aliceAge = ageMap.get("Alice");
        System.out.println("Age of Alice: " + aliceAge);

        // Check if the map contains the key "Bob"
        boolean containsBob = ageMap.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + containsBob);
    }
}