package day2;

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the First Number: ");
       int a = sc.nextInt();
       System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}