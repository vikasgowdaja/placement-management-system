package day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        // Using HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("John", "John's Value");
        hashMap.put("Alice", "Alice's Value");
        hashMap.put("Bob", "Bob's Value");

        // Using LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("John", "John's Value");
        linkedHashMap.put("Alice", "Alice's Value");
        linkedHashMap.put("Bob", "Bob's Value");

        // Print HashMap and LinkedHashMap
        System.out.println("HashMap: " + hashMap.toString());
        System.out.println("LinkedHashMap: " + linkedHashMap.toString());
    }
}