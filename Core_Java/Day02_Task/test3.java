package Day02_Task;


import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter the 2nd number: ");
            b = sc.nextInt();
            System.out.print("Enter the 3rd number: ");
            c = sc.nextInt();
        }
        
        if(a>c && a>b)
            System.out.println(a + " is the largest");
        else if(b>a && b>c)
            System.out.println(b + " is the largest");
        else 
            System.out.println(c + " is the largest");
    }
}
