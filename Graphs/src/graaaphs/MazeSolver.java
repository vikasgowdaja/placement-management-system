package graaaphs;

import java.util.ArrayList;
import java.util.List;

public class MazeSolver {
    private static final int[][] MAZE = {
        { 1, 1, 1, 1, 1 },
        { 1, 0, 0, 0, 1 },
        { 1, 1, 1, 0, 1 },
        { 1, 0, 0, 0, 1 },
        { 1, 1, 1, 1, 1 }
    };
    private static final int ROWS = MAZE.length;
    private static final int COLS = MAZE[0].length;
    private static final int[][] DIRECTIONS = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    private static boolean[][] visited;

    public static void main(String[] args) {
        visited = new boolean[ROWS][COLS];
        List<String> path = new ArrayList<>();
        boolean found = findPath(0, 0, path);
        if (found) {
            System.out.println("Path found:");
            for (String step : path) {
                System.out.println(step);
            }
        } else {
            System.out.println("No path found.");
        }
    }

    private static boolean findPath(int row, int col, List<String> path) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || MAZE[row][col] == 0 || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (row == ROWS - 1 && col == COLS - 1) {
            return true;
        }

        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (findPath(newRow, newCol, path)) {
                path.add("(" + row + ", " + col + ")");
                return true;
            }
        }

        return false;
    }
}

