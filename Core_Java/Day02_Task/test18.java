import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }
        int count = 0;
        while(number>0) {
            count = count + number%10;
            number = number/10;
        }
        System.out.println("The sum of digits: " + count);
    }
}
