package Day02_Task;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }

        int a = 0;
        int b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);

        for(int i=3; i<=number; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
