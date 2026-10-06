import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int y, m, d;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year of joining: ");
            y = sc.nextInt();
            System.out.print("Enter the month of joining: ");
            m = sc.nextInt();
            System.out.print("Enter the day of joining: ");
            d = sc.nextInt();
        }
        LocalDate join = LocalDate.of(y, m, d);
        System.out.println("Date of joining: " + join);

        Period duration = Period.between(join, today);
        System.out.println("Duration: " + duration.getYears() + " years, " + duration.getMonths() + " months, " + duration.getDays() + " days");
    }
} 