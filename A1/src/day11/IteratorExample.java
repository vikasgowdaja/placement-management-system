package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        // Create an iterator for the list
        Iterator<Integer> iterator = numbersList.iterator();

        // Print each element using the "next" method while iterating
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
