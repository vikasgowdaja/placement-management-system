package day13;

public class PriorityThread extends Thread {
    private String name;

    public PriorityThread(String name, int priority) {
        this.name = name;
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("Thread 1 (Low Priority)", Thread.MIN_PRIORITY);
        PriorityThread thread2 = new PriorityThread("Thread 2 (Normal Priority)", Thread.NORM_PRIORITY);
        PriorityThread thread3 = new PriorityThread("Thread 3 (High Priority)", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}