package day3;

import java.util.Scanner;

public class StringDuplicateRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        if (input.length() > 0) {
            result.append(input.charAt(0));

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    result.append(input.charAt(i));
                }
            }
        }

        System.out.println("Modified String: " + result.toString());
    }
}
