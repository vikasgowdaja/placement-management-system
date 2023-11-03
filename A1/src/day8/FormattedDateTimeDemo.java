package day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedDateTimeDemo {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date & Time: " + formattedDate);
    }
}