package Java;

import java.util.HashMap;

public class HashMap01 {

	static void main(String[] args) {
	HashMap<String,Integer>empIds= new HashMap<>();
	empIds.put("John",267549);
	empIds.put("Vikas",460646);
	empIds.put("Meguuu",866029650);
	empIds.put("Ananda",998070069);
	System.out.println(empIds);
	System.out.println(empIds.get("John"));
	empIds.put("John",2954145);
	empIds.put("Man", 25849);
	System.out.println(empIds.get("John"));
	}

}
