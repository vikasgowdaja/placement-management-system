package Collection01.com;
import java.util.*;
public class Collections02 {

	public static void main(String[] args) {
		LinkedList<String>go_boy = new LinkedList<String>();
		go_boy.add("red");
		go_boy.add("Blue");
		go_boy.addFirst("somewhere");
		go_boy.addLast("Nowhere");
		go_boy.addAll(go_boy);
		System.out.println(go_boy);
		
	}

}
