package day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WeeksBeforeCurrentDateDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate weeksBefore = currentDate.minusWeeks(47);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = weeksBefore.format(formatter);
        System.out.println("Date 47 weeks before the current date: " + formattedDate);
    }
}