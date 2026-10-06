
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test6 {
    public static void main(String[] args) throws Exception {

        int salary;
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=12; i++) {
                // salary = 0;
                System.out.print("Enter salary of month " + i + " : ");
                salary = sc.nextInt();
            }
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Callable<Integer> task1 = () -> {
            Thread.sleep(5000);
            return 12;
        };

        Future<Integer> f1 = executor.submit(task1);

        System.out.println("Annual Salary: " + f1.get());
        
        executor.shutdown();
    }
}
