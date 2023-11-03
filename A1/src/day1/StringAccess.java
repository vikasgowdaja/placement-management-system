package day1;

public class StringAccess {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String secondString = args[1];
            char firstChar = secondString.charAt(0);
            char lastChar = secondString.charAt(secondString.length() - 1);
            System.out.println("First Char: " + firstChar);
            System.out.println("Last Char: " + lastChar);
        }
    }
}
