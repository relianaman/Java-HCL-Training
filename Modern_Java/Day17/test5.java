
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        day = sc.nextInt();
        
        String result;

        switch (day) {
            case 1: 
                result = "Monday";
                break;
            case 2: 
                result = "Tuesday";
                break;
            case 3: 
                result = "Wednesday";
                break;
            case 4:
                result = "Thrusday";
                break;
            case 5: 
                result = "Friday";
                break;
            case 6: 
                result = "Saturday";
                break;
            case 7: 
                result = "Sunday";
                break;
            default:
                result = "Invalid Day";
        }

        System.out.println(result);
    }
}
