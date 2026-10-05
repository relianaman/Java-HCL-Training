
import java.time.LocalDate;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        
        String input1;
        int input2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the starting date of subscription (yyyy-MM-dd): ");
            input1 = sc.nextLine();
            System.out.print("Enter the duration in months: ");
            input2 = sc.nextInt();
        }

        LocalDate start = LocalDate.parse(input1);

        LocalDate today = LocalDate.now();

        LocalDate end = start.plusMonths(input2);
        System.out.println("Expiry Date: " + end);

        if(today.isBefore(end))
            System.out.println("Subscription is active");
        else
            System.out.println("Subscription is expired");
    }
}
