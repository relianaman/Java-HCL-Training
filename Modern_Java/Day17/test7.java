import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        
        int day;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            day = sc.nextInt();
        }
        
        String result = switch (day) {

            case 1, 2, 3, 4, 5 -> "Weekday";

            case 6, 7 -> "Weekend";

            default -> "Invalid";
        };

        System.out.println(result);
    }
}
