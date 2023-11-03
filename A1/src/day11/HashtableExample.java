package day11;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> agesTable = new Hashtable<>();
        agesTable.put("John", 25);
        agesTable.put("Alice", 30);
        agesTable.put("Bob", 28);

        // Retrieve and print the age of Alice
        int aliceAge = agesTable.get("Alice");
        System.out.println("Age of Alice: " + aliceAge);

        // Check if the Hashtable contains the key "Bob"
        boolean containsBob = agesTable.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + containsBob);
    }
}
