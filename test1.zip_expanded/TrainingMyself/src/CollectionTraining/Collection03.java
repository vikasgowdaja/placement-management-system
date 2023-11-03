package CollectionTraining;
import java.util.*;
public class Collection03 {
	public static void main(String[] args) {
	List<String>lost_Strings=new ArrayList<String>();
	lost_Strings.add("Man");
	lost_Strings.add("Women");
	lost_Strings.add("Man+Women=Child");
	
	System.out.println(lost_Strings);
	String funy =lost_Strings.get(0);
	System.out.println("Frist element:"+funy);
    funy =lost_Strings.get(2);
	System.out.println("Third element:"+funy);
	
	}
}

