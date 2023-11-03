package day13;

import java.util.concurrent.RecursiveAction;

public class ParallelismVsConcurrencyExample {

    public static void main(String[] args) {
        int numberOfTasks = 5;

        // Example of Concurrency (using Threads)
        System.out.println("== Concurrency (using Threads) ==");
        for (int i = 0; i < numberOfTasks; i++) {
            Runnable concurrentTask = () -> {
                System.out.println("Concurrent Task " + Thread.currentThread().getId() + " is running.");
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Concurrent Task " + Thread.currentThread().getId() + " is done.");
            };
            new Thread(concurrentTask).start();
        }

        // Example of Parallelism (using Fork/Join Framework)
        System.out.println("== Parallelism (using Fork/Join) ==");
        ParallelTask parallelTask = new ParallelTask(0, numberOfTasks);
        parallelTask.compute();
    }

    static class ParallelTask extends RecursiveAction {
        private final int start;
        private final int end;

        ParallelTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= 1) {
                System.out.println("Parallel Task " + Thread.currentThread().getId() + " is running.");
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Parallel Task " + Thread.currentThread().getId() + " is done.");
            } else {
                int mid = start + (end - start) / 2;
                ParallelTask leftTask = new ParallelTask(start, mid);
                ParallelTask rightTask = new ParallelTask(mid, end);
                invokeAll(leftTask, rightTask);
            }
        }
    }
}
