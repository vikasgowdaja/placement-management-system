package day2;

public class SquareWithoutOperators {
    public static void main(String[] args) {
        int num = 5;
        int square = 0;
        
        for (int i = 0; i < num; i++) {
            square += num;
        }

        System.out.println("Square of " + num + ": " + square);
    }
}