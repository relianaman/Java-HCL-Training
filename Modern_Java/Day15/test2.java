package Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test2 {
    public static void main(String[] args) {

        // create thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // submit 6 tasks
        for(int i=1; i<=6; i++) {

            int taskNumber = i;

            executor.execute(() -> {
                System.out.println(
                    "Task " + taskNumber + " started by " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                    "Task " + taskNumber + " completed by " + Thread.currentThread().getName()
                );
            });
        }

        // stop accepting new task
        executor.shutdown();
    }
}
