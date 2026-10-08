package Day15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test1 {
    public static void main(String[] args) {
        
        // 1. core pool size
        int corePoolSize = 2;

        // 2. maximum pool size
        int maximumPoolSize = 4;

        // 3. keep alive time
        long keepAliveTime = 10;

        // 4. time unit
        TimeUnit timeUnit = TimeUnit.SECONDS;
        
        // 5. work queue
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);

        // 6. thread factory
        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        // 7. rejected execution handler
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

        try ( // create threadpoolexecutor
            ThreadPoolExecutor executor = new ThreadPoolExecutor (
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                timeUnit,
                workQueue,
                threadFactory,
                handler
            )
        ) {
            // submit tasks
            for(int i=1; i<=6; i++) {
                final int taskNumber = i;

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
        }    
    }
}