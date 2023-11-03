package day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> countriesMap = new LinkedHashMap<>();
        countriesMap.put("USA", "New York");
        countriesMap.put("UK", "London");
        countriesMap.put("India", "Mumbai");

        // Display the LinkedHashMap using the "toString" method
        System.out.println("Countries Map: " + countriesMap.toString());
    }
}
