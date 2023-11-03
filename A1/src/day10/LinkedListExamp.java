package day10;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamp {
	public static void main(String[] args) {
		List<Integer>numbers =new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers);
		numbers.get(0);
		System.out.println(numbers.get(0));
		numbers.set(0, 50);
		System.out.println(numbers);
		
		
		numbers.remove(1);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);
		
		
	}

}
