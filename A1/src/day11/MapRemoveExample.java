package day11;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveExample {
    public static void main(String[] args) {
        Map<String, Integer> scoresMap = new HashMap<>();
        scoresMap.put("John", 85);
        scoresMap.put("Alice", 90);
        scoresMap.put("Bob", 78);

        // Remove Alice from the map
        scoresMap.remove("Alice");

        // Display the updated map using the "toString" method
        System.out.println("Updated Scores Map: " + scoresMap.toString());
    }
}
