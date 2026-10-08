package Day14;


// Thread Pool 1

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test2 {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // ExecutorService - class
        // executor - Reference var
        // Executors - 
        
        // number of task is 5
        for(int i=1; i<=5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is performed by " + Thread.currentThread());
            });
        }
    }
}
