
import java.time.LocalDate;
import java.time.Period;

public class test11 {
    public static void main(String[] args) {
        
        LocalDate dob = LocalDate.of(2003, 11, 24);

        LocalDate today = LocalDate.now();

        Period age = Period.between(today, dob);
        System.out.println("Age: "  + age);
    }
}
