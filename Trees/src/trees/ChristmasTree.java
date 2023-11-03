package trees;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 5;
        int spaces = height - 1;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            spaces--;
            stars += 2;
        }
    }
}

