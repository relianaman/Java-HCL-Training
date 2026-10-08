package Day02_Task;


import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int year;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year: ");
            year = sc.nextInt();
        }
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
}
