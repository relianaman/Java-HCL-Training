package Day02_Task;


import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
        }
        if(a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
