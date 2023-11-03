package day9;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        printList(intList); // Output: 1 2 3
        printList(stringList); // Output: Hello World
    }
}