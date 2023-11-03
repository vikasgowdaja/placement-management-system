package day13;

public class OddEvenPrinter {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println("Odd: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println("Even: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
