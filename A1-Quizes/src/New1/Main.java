package New1;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Predicate predicate = s -> s.length() > 3;
		Stream stream = Stream.iterate("-", (s) -> s + s);
		boolean b1 = stream.noneMatch(predicate);
		boolean b2 = stream.anyMatch(predicate);
		System.out.println(b1 + "" + b2);
	}

}
