package Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test4 {
    public static void main(String[] args) {
        
        // create cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        //submit 10 tasks
        for (int i=1; i<=10; i++) {
            
            int taskNumber = i;

            executor.submit(() -> {
                System.out.println(
                    "Task " + taskNumber + " executed by " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // shutdown executor
        executor.shutdown();
    }
}
