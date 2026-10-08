
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        int day;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            day = sc.nextInt();
        }
        
        String result;

        result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

        System.out.println(result);
    }
}
