package day10;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(3);
        setB.add(4);
        setB.add(5);

        // Union of sets
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
//        System.out.println(setA);
//        System.out.println(setB);
//        System.out.println(unionSet);
        
        
//        Set<Integer> union = new HashSet<>();
//        union.addAll(setB);
//        union.addAll(setA);
//         Intersection of sets
        Set<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);
//        System.out.println(intersectionSet);

        // Difference of sets
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println(differenceSet);
    }
    
}
