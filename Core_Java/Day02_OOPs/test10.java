package Day02_OOPs;


import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            do { 
                System.out.print("Enter a positive number: ");
                n = sc.nextInt();
            } while (n < 0);
        }

        System.out.println("You entered a valid positive number " + n);
    }
}
