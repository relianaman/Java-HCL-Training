import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the date (dd-MM-yyyy): ");
            input = sc.nextLine();
        }

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input,dft);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(date.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println(date.format(format3));
    }
}
