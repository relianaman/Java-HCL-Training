import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class test9 {
    public static void main(String[] args) {

        Instant timestamp = Instant.now();

        ZoneId india = ZoneId.of("Asia/Kolkata");

        ZonedDateTime indian_time = timestamp.atZone(india);

        System.out.println("UTC Timestamp: " + timestamp);
        System.out.println("Indian Time: " + indian_time);
    }
}