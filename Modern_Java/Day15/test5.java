package Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test5 {
    public static void main(String[] args) {
        
        // create single thread pool 
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // submit task 1
        executor.submit(() -> {
            System.out.println(
                "Task 1 executed by " + Thread.currentThread().getName() 
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }    
            
            System.out.println("Task 1 completed");
        });

        //submit task 2
        executor.submit(() -> {
            System.out.println(
                "Task 2 executed by " + Thread.currentThread().getName() 
            );    
            
            System.out.println("Task 2 completed");
        });

        //submit task 3
        executor.submit(() -> {
            System.out.println(
                "Task 3 executed by " + Thread.currentThread().getName() 
            );    
            
            System.out.println("Task 3 completed");
        });

        //shutdown()
        executor.shutdown();
    }
}
