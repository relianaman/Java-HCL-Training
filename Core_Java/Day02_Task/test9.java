package Day02_Task;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        int a,b;
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
            System.out.println("----Enter your choice: ---");
            System.out.println("Press 1 for add");
            System.out.println("Press 2 for subtract");
            System.out.println("Press 3 for multiply");
            System.out.println("Press 4 for divide");
            choice = sc.nextInt();
        }

        switch(choice) {
            case 1 -> System.out.println("Result: " + (a+b));
            case 2 -> System.out.println("Result: " + (a-b));
            case 3 -> System.out.println("Result: " + (a*b));
            case 4 -> System.out.println("Result: " + (a/b));
            default -> System.out.println("Please enter valid choice");
        }
    }
}
