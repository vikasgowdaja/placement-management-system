package day14;
import java.util.Scanner;

import java.util.Scanner;

public class RatInMaze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of columns (m): ");
        int m = scanner.nextInt();

        int[][] maze = new int[n][m];

        System.out.println("Enter the maze (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        if (solveMaze(maze, n, m, 0, 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    // Function to check if the current position is a valid move
    private static boolean isValidMove(int[][] maze, int n, int m, int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m && maze[x][y] == 1);
    }

    // Recursive function to solve the maze
    private static boolean solveMaze(int[][] maze, int n, int m, int x, int y) {
        // If the rat reaches the destination, return true
        if (x == n - 1 && y == m - 1) {
            return true;
        }

        // Check if the current position is a valid move
        if (isValidMove(maze, n, m, x, y)) {
            // Mark the current position as visited
            maze[x][y] = 2;

            // Move right
            if (solveMaze(maze, n, m, x, y + 1)) {
                return true;
            }

            // Move down
            if (solveMaze(maze, n, m, x + 1, y)) {
                return true;
            }

            // If no valid move, backtrack
            maze[x][y] = 0;
            return false;
        }

        return false;
    }
}

