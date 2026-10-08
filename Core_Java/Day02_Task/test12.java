package Day02_Task;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
        }

        if (a == 0) {
            System.out.println("The HCF of " + a + " and " + b + " is " + b);
        } 
        else if (b == 0) {
            System.out.println("The HCF of " + a + " and " + b + " is " + a);
        }
        else {
            int min;
            if(a>b) {
                min = b;
            } else {
                min = a;
            }
    
            int hcf = 1;
            for(int i=1; i<=min; i++) {
                if(a%i == 0 && b%i == 0) 
                    hcf = i;
            }
            System.out.println("The HCF of " + a + " and " + b + " is " + hcf);
        }
    }
}
