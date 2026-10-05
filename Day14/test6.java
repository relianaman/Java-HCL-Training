
import java.time.LocalDate;

public class test6 {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate yesterday = today.minusDays(1);
        if(today.isAfter(yesterday)) {
            System.out.println("Sahi baat hai");
        }
    }
}
