package day10;

import java.util.ArrayList;
import java.util.List;

public class ElementPresenceInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int elementToFind = 20;

        if (numbers.contains(elementToFind)) {
            System.out.println("Element " + elementToFind + " is present in the list.");
        } else {
            System.out.println("Element " + elementToFind + " is not present in the list.");
        }
    }
}
