import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {

        int year, month;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter year: ");
            year = sc.nextInt();
            
            System.out.print("Enter month (1-12): ");
            month = sc.nextInt();
        }

        LocalDate date = LocalDate.of(year, month, 1);
        
        LocalDate lastFriday = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        
        System.out.println("Last Friday: " + lastFriday);
        
    }
}