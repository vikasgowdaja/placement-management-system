package day13;

public class SimpleMultithreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new NumberPrinterThread("Thread-1", 1, 5);
        Thread thread2 = new NumberPrinterThread("Thread-2", 6, 10);
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread

     
        System.out.println("All threads have finished.");
    }
}

class NumberPrinterThread extends Thread {
    private final String name;
    private final int start;
    private final int end;

    public NumberPrinterThread(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(name + " prints: " + i);
            try {
                Thread.sleep(3000); // Add a small delay to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
