package day10;

import java.util.EnumSet;

public class EnumSetExample {
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Creating an EnumSet
        EnumSet<Days> workingDays = EnumSet.range(Days.MONDAY, Days.FRIDAY);

        // Adding an element to the EnumSet
        workingDays.add(Days.SATURDAY);

        // Removing an element from the EnumSet
        workingDays.remove(Days.SATURDAY);

        // Checking if the EnumSet contains an element
        boolean containsSunday = workingDays.contains(Days.SUNDAY);

        // Iterating through the EnumSet
        for (Days day : workingDays) {
            System.out.println(day);
        }
    }
}
