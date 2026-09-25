import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
        }

        if (a == 0 || b == 0) {
            System.out.println("The LCM of " + a + " and " + b + " is " + 0);
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

            int lcm = (a*b)/hcf;
            System.out.println("The LCM of " + a + " and " + b + " is " + lcm);
        }
    }
}
