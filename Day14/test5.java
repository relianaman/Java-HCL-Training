
import java.time.LocalDate;

public class test5 {
    public static void main(String[] args) {

        // for today
        LocalDate now = LocalDate.now();
        now.getDayOfWeek();
        now.getDayOfMonth();
        now.getDayOfYear();

        // for custom date
        LocalDate customDate = LocalDate.of(2003, 11, 24);
        System.out.println("Bday: " + customDate);

        // for current date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // for yesterday
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Yesterday: " + yesterday);

        // for last month
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Last month: " + lastMonth);

        // for last year
        LocalDate lastYear = today.minusYears(1);
        System.out.println("Last year: " + lastYear);

    }
}
