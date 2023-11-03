package day13;

public class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();
    }
}
