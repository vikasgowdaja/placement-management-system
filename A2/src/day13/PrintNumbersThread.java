package day13;

public class PrintNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumbersThread thread = new PrintNumbersThread();
        thread.start();
    }
}
