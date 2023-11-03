package day2;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
		
		Scanner pu = new Scanner(System.in);
		System.out.println("Enter the Choice:");
		int choice = pu.nextInt()
;
		switch(choice) {
		case 1:System.out.println("Day 1 Its Monday");
		break;
		case 2:System.out.println("Day 2 Its Tuesday");
		break;
		case 3:System.out.println("Day 3 Its Wednesdy");
		break;
		case 4:System.out.println("Day 4 Its Thrusday");
		break;
		case 5:System.out.println("Day 5 Its Friday");
		break;
		case 6:System.out.println("Day 6 Its Saturday");
		break;
		case 7:System.out.println("Day 7 Its Sunday");
		break;
		default : System.out.println("Invalid Choice");
		break;
		
		}
		
	
	}

}
