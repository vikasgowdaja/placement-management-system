package day9;

import java.util.HashMap;
import java.util.Map;

public class GenericsMap {
    public static void main(String[] args) {
        // Creating a generic Map with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alice", 28);

        // Accessing elements using keys
        int ageOfJohn = map.get("John");
        int ageOfAlice = map.get("Alice");

        System.out.println("Age of John: " + ageOfJohn);
        System.out.println("Age of Alice: " + ageOfAlice);
    }
}
