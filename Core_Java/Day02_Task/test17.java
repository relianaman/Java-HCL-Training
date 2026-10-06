import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }
        int count = 0;
        while(number>0) {
            number = number/10;
            count++;
        }
        System.out.println("The number of digits: " + count);
    }
}
