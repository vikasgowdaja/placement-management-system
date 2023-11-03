package day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // Number of threads in the pool: 3

        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i; // Capture the value of i in a separate effectively final variable
            Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is executing task " + taskNumber);
            executorService.submit(task);
        }

        executorService.shutdown();
    }
}
