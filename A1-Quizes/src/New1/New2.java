package New1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class New2{
public static void main(String [] a) { List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7); System.out.println("print no numbers:"); evaluate(list, (n)->false); System.out.println("Print numbers greater than 5:"); evaluate(list, (n)->n> 5 ); }

public static void evaluate(List<Integer> list, Predicate<Integer> predicate) { for (Integer n: list) { if (predicate.test(n)) { System.out.println(n + " ");}
}
}
}