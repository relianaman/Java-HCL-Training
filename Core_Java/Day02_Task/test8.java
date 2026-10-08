package Day02_Task;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
        }

        System.out.println("Before swapping: a="+a+" and b="+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping: a="+a+" and b="+b);
    }
}
