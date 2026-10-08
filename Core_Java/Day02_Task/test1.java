package Day02_Task;


import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            i = sc.nextInt();
        }
        System.out.println(i);
    }
}