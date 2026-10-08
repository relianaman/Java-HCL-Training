package Day14;


import java.time.LocalTime;

public class test7 {
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //for current hour
        System.out.println(now.getHour());

        //for current min
        System.out.println(now.getMinute());

        //for current sec
        System.out.println(now.getSecond());

        //for current nano sec
        System.out.println(now.getNano());

        //for custom time
        LocalTime customTime = LocalTime.of(6, 4, 0);
        System.out.println(customTime);

        //parsing
        String timeString = "15:30:45";
        System.out.println(LocalTime.parse(timeString));

        //pervious hour
        LocalTime pastTime = now.minusHours(1);
        System.out.println(pastTime);
    }
}
