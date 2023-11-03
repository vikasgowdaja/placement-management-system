package Generics;


import java.util.*;
public class LinkedPeek2 {

public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();

		
		
		
		list.add("Geeks");
		list.add("8");
        list.add("z");
		list.add(4);
		System.out.println("The initial list is :" + list);

		
		System.out.println("First element of the list is : " + list.peekFirst());
	}
}
