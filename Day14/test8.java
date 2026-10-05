
import java.time.LocalDateTime;

public class test8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // custom date time
        LocalDateTime customDT = LocalDateTime.of(2003, 11, 24, 6, 4);
        System.out.println(customDT);
    }
}
