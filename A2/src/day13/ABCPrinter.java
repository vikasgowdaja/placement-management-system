package day13;

public class ABCPrinter {
    private static final Object lock = new Object();
    private static final int MAX_ITERATIONS = 3;
    private static char nextChar = 'A';

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> printChar('A'));
        Thread threadB = new Thread(() -> printChar('B'));
        Thread threadC = new Thread(() -> printChar('C'));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static void printChar(char ch) {
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            synchronized (lock) {
                while (ch != nextChar) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(ch);
                nextChar = (char) (nextChar == 'C' ? 'A' : nextChar + 1);
                lock.notifyAll();
            }
        }
    }
}
