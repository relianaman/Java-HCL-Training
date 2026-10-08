package Day02_OOPs;


import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int table;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the table: ");
            table = sc.nextInt();
        }
        for(int i=1; i<=10; i++) {
            System.out.println(table + " x " + i + " = " + table*i);
        }
    }
}
