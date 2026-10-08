package Day14;


// Thread pool 2

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test3 {
    public static void main(String[] args) throws Exception {
        
        // create thread pool with 2 thread
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // submit callable track
        Future<Integer> f1 = executor.submit(() -> {
            try {
                System.out.println("Task started");

                // simulate a time-consuming task
                Thread.sleep(10000);

                System.out.println("Task completed");
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task interrupted");
            }

            return 10;
        });

        System.out.println("Waiting for result");

        System.out.println("Result: " + f1.get());

        executor.shutdown();
    }
}
