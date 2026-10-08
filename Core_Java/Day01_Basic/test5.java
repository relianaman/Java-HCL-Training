package Day01_Basic;


import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int balance = 10000;
        int deposite, withdraw;
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("---Enter your choice---");
                System.out.println("Press 1 for balance");
                System.out.println("Press 2 for deposite");
                System.out.println("Press 3 for withdrawal");
                System.out.println("Press 4 for exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> { 
                        System.out.println("Your current balance is : " + balance);
                        System.out.println();
                    }
                        
                    case 2 -> {
                        System.out.print("Enter the deposite amount : ");
                        deposite = sc.nextInt();
                        if(deposite > 0) {
                            balance += deposite;
                            System.out.println("Your current balance is : " + balance);
                            System.out.println();
                        }
                        else {
                            System.out.println("Please enter corrent amount");
                            System.out.println();
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Enter the withdraw amount : ");
                        withdraw = sc.nextInt();
                        if(withdraw <= balance && withdraw > 0) {
                            balance -= withdraw;
                            System.out.println("Your current balance is : " + balance);
                            System.out.println();
                        }
                        else {
                            System.out.println("Please enter corrent amount");
                            System.out.println();
                        }
                    }
                        
                    case 4 -> {
                        System.out.println("Thanks for visiting SBI");
                        System.out.println();
                    }
                        
                    default -> {
                        System.out.println("Invalid choice. Please try again.");
                        System.out.println();
                    }
                }
            } while (choice != 4);
        }
    }
}
