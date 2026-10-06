import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the date and time of the meeting (yyyy-MM-dd HH:mm): ");
            input = sc.nextLine();
        }

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            
        LocalDateTime meeting = LocalDateTime.parse(input, dft);
        
        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZoneId newYork = ZoneId.of("America/New_York");
        
        ZonedDateTime india_time = ZonedDateTime.of(meeting, india);
        
        ZonedDateTime newYork_time = india_time.withZoneSameInstant(newYork);
        
        System.out.println("India: " + india_time);
        System.out.println("New York: " + newYork_time);
        
    }
}