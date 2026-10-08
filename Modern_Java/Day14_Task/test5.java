package Day14_Task;


import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        String input1, input2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the test starting time (HH-mm-ss): ");
            input1 = sc.nextLine();
            System.out.print("Enter the test ending time (HH-mm-ss): ");
            input2 = sc.nextLine();
        }
        
        LocalTime start = LocalTime.parse(input1);
        LocalTime end = LocalTime.parse(input2);

        Duration time = Duration.between(start, end);

        System.out.println("Duration: " + time.toHours() + " hours " + time.toMinutes()%60 + " minutes " + time.getSeconds()%60 + " seconds ");

    }
}
