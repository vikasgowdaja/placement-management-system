package CollectionTraining;
import java.util.*;

public class Collection04 {
	  public static void main(String[] args) {
		List<String>Vikas_lists=new ArrayList<String>();
		Vikas_lists.add("Bag");
		Vikas_lists.add("bike");
		Vikas_lists.add("Laptop");
		Vikas_lists.add("mobiles");
		Vikas_lists.add("Chargers");
	System.out.println(Vikas_lists);
	Vikas_lists.remove(3);
	Vikas_lists.remove(0);
	for(String me: Vikas_lists) {
	System.out.println("After removing the first and third element from the list:\n" +me);
	
	  }
	  }
}
