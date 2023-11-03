package day3;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix 1
        System.out.println("Enter the number of rows for Matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 1:");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements for Matrix 1:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.println("Enter the number of rows for Matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 2:");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements for Matrix 2:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Check if the matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added. They must have the same dimensions.");
            return;
        }

        // Matrix addition
        int[][] sumMatrix = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Output the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
