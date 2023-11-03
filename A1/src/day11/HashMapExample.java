package day11;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> capitalsMap = new HashMap<>();
        capitalsMap.put("USA", 1);
        capitalsMap.put("UK", 2);
        capitalsMap.put("India",0);

        // Retrieve and print the capital of the UK
        Integer ukCapital = capitalsMap.get("UK");
        System.out.println("Capital of UK: " + ukCapital);

        // Check if the map contains the key "India"
        boolean containsIndia = capitalsMap.containsKey("India");
        System.out.println("Contains key 'India': " + containsIndia);
    }
}
