package day3;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Jagged Array
        System.out.println("Enter the number of rows for the jagged array:");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        System.out.println("Enter the elements for the jagged array:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the number of elements in row " + (i + 1) + ":");
            int numElements = scanner.nextInt();
            jaggedArray[i] = new int[numElements];

            System.out.println("Enter " + numElements + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < numElements; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Output the Jagged Array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
