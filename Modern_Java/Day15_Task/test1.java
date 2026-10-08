package Day15_Task;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary of month: ");
        int salary = sc.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        ExecutorService executor = Executors.newSingleThreadExecutor();

        int annualSalary = 0;

        for(int i=0; i<12; i++) {
            System.out.print("Enter the leave days in " + months[i] + ": ");
            int leave = sc.nextInt();

            int month = i;

            Callable<Integer> task1 = () -> {
                Thread.sleep(1000);

                if(leave != 0) {
                    int working = days[month] - leave;
                    int daily = (int) salary / days[month];

                    return working*daily;
                }

                return salary;
            };
            
            Future<Integer> f1 = executor.submit(task1);

            int monthlySalary = f1.get();
            System.out.println(months[i] + " Salary: " + monthlySalary);

            annualSalary = annualSalary + monthlySalary;
        }

        Thread.sleep(1000);
        
        System.out.println();
        System.out.println("Annual Salary: " + annualSalary);
        
        executor.shutdown();
    }
}



