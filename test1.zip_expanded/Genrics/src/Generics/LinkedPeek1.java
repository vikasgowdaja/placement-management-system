package Generics;

import java.util.*;
public class LinkedPeek1 {

public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();

		
		list.add("Gem");
		list.add(4);
		list.add("Grow");
		list.add("five");

		
		System.out.println("The initial list is :" + list);

		
		System.out.println("Head of the list : " + list.peek());
	}
}
