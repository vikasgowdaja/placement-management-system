package New1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test{
public static void main(String[] args) throws IOException {
    List<String> strings = Arrays.asList("Vikas1", "foo1.1", "foo", "room2.3", "room100.999", "room10", "room.3");

    Collections.sort(strings, new Comparator<String>() {
        public int compare(String o1, String o2) {
            return extractInt(o1) - extractInt(o2);
        }

        int extractInt(String s) {
            String num = s.replaceAll("\\D", "");
            // return 0 if no digits found
            return num.isEmpty() ? 0 : Integer.parseInt(num);
        }
    });
    System.out.println(strings);
}}