package Collections.com;
	import java.util.List;
	import java.util.ArrayList;
public class AddAll {

	public static void main(String[] args) {
	List<String> val1 = new ArrayList<>();
	val1.add("corona can be sttoped");
	List<String> val2 = new ArrayList<>();
	val2.add("staying at home");
	val1.addAll(val2);
	System.out.println(val1);
		// TODO Auto-generated method stub

	}

}
