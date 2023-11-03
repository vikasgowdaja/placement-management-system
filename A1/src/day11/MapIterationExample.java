package day11;

import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<String, Integer> subjectsMap = new HashMap<>();
        subjectsMap.put("Math", 90);
        subjectsMap.put("Science", 85);
        subjectsMap.put("English", 95);

        // Iterate through the map and print each subject and its corresponding mark
        for (Map.Entry<String, Integer> entry : subjectsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
