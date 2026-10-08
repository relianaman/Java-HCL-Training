package Day02_Task;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }

        int count = 0;
        for(int i=1; i<=number; i++) {
            if(number%i == 0)
                count++;
        }

        if(count == 2) 
            System.out.println("Prime Number");
        else
            System.out.println("Not prime number");
    }
}
