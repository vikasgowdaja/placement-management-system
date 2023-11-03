package day4;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        printFibonacci(n);
    }
}