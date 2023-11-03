package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String>fruits =new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Berry");
		fruits.add("Grapes");
		fruits.add("Grapes");
		fruits.add("Grapes");
		
		System.out.println(fruits);
		fruits.remove("Apple");
		System.out.println(fruits);
		
		fruits.set(1, "Mango");
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		boolean vikas= fruits.isEmpty();	
		System.out.println(vikas);
	}

}
