package Day02_OOPs;


import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
        }
        if(number%2 != 0) 
            number += 1;

        while(number <= 100) {
            System.out.println("The even number are: " + number);
            number += 2;
        }
    }
}
