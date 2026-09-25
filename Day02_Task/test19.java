import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }

        int res = 0;
        int temp = number;
        int digits = 0;

        while(temp > 0) {
            temp = temp/10;
            digits = digits + 1;
        }

        temp = number;

        while(temp > 0) {
            int digit = temp%10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }

            res = res + power;
            temp = temp/10;
        }

        if(number == res)
            System.out.println("Armstrong");
        else
            System.out.println("Not armstronng");
    }
}
