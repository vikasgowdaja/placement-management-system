package CollectionTraining;
import java.util.*;

public class Collection01 {
	public static void main(String[] args) {
		//Create a list and add some colors  to the list
		List<String>list_Strings =new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		//Print the list
		for (String element : list_Strings) {
			System.out.println(element);
		}
		
	}

}
