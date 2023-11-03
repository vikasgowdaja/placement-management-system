package day4;

import java.util.Scanner;

public class RecursiveSumOfNaturalNumbers {
    public static int findSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + findSum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}