package day13;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("A");
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                threadA.join(); // Wait for threadA to finish before starting threadB
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println("B");
            }
        });

        threadA.start();
        threadB.start();
    }
}
