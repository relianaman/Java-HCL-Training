
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the date(yyyy-mm-dd) of exam: ");
            input = sc.nextLine();
        }
        LocalDate exam = LocalDate.parse(input);

        System.out.println("Date of exam : " + exam);

        System.out.println("Day of week of exam : " + exam.getDayOfWeek());

        Period days = Period.between(today, exam);
        System.out.println("Remaining time: " + days.getDays() + " days " + days.getMonths() + " months " + days.getYears() + " years");

        if((exam.getYear()%4 == 0 && exam.getYear()%100 != 0) || (exam.getYear()%400 == 0))
            System.out.println("Exam year is leap year");
        else
            System.out.println("Exam year is not leap year");
        
    }
}
