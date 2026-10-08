package Day02_OOPs;


import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int marks;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks: ");
            marks = sc.nextInt();
        }
        if(marks > 90) 
            System.out.println("A grade");
        else if(marks > 75)
            System.out.println("B grade");
        else if(marks > 60)
            System.out.println("C grade");
        else if(marks > 40)
            System.out.println("D grade");
        else 
            System.out.println("Fail");
    }
}
