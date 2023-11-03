package day2;

public class LoopDemo {
    public static void main(String[] args) {
        int i = 1;

        // while loop
        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        // do-while loop
        i = 1;
        do {
            System.out.println("Do-While Loop: " + i);
            i++;
        } while (i <= 5);

        // for loop
        for (i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }
    }
}