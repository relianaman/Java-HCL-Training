import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            
            if(number > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is negative");
            }
        }
    }
}
