package day7;

import java.util.Scanner;

public class TryCatchWithThrowDemo {
    public static void main(String[] args) {
        try {
        	Scanner dc = new Scanner(System.in);
        	System.out.println("Enter the age: ");
            int age = dc.nextInt();
            if (age < 0) {
            	  throw new IllegalArgumentException("Age cannot be negative");
            }
            else {
            	System.out.println("Age Updated Successfully");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
