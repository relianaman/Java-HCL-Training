package Day02_Task;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int i;
        int f=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            i = sc.nextInt();
        }
        while(i>0) {
            f = f * i;
            i = i-1; 
        }
        System.out.println(f);
    }
}
