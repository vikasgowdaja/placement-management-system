package day3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = new int[array.length];
        int index = 0;

        for (int num : array) {
            if (!contains(uniqueArray, num)) {
                uniqueArray[index] = num;
                index++;
            }
        }

        uniqueArray = Arrays.copyOf(uniqueArray, index);

        System.out.println("Array with duplicates removed:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static boolean contains(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
