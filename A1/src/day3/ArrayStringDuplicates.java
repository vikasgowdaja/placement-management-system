package day3;

import java.util.Scanner;

public class ArrayStringDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        String[] array = new String[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("Duplicates in the array:");
        findDuplicates(array);
    }

    public static void findDuplicates(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }
    }
}
//[Vikas,karthik,Bhavya,Vikas]