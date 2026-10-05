
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test10 {
    public static void main(String[] args) {
        String Date = "24/11/2003";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(Date, dtf);
        System.out.println(parse);
    }
}
