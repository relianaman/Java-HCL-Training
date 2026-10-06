import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        
        String input1;
        int input2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the test starting date of project (yyyy-MM-dd): ");
            input1 = sc.nextLine();
            System.out.print("Enter the numbers of week allocated: ");
            input2 = sc.nextInt();
        }

        LocalDate start = LocalDate.parse(input1);
        LocalDate end = start.plusWeeks(input2);

        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(today, end);

        if(days > 0)
            System.out.println("Remaining days to Deadline: " + days);
        else if(days == 0) 
            System.out.println("Today is Deadline");
        else
            System.out.println("Deadline passed");
    }
}
