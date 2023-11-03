package day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthsBeforeCurrentDateDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate monthsBefore = currentDate.minusMonths(53);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = monthsBefore.format(formatter);
        System.out.println("Date 53 months before the current date: " + formattedDate);
    }
}
