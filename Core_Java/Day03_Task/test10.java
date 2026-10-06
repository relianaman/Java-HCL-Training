
import java.util.Scanner;

public class test10 {
    float marks;

    int p;
    int m;
    int c;

    void get() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks of maths: ");
            m = sc.nextInt();
            System.out.print("Enter the marks of physics: ");
            p = sc.nextInt();
            System.out.print("Enter the marks of chemistry: ");
            c = sc.nextInt();
        }

        marks = (p+c+m)/3;
    }

    void display() {
        if(marks >= 90) 
            System.out.println("A grade");
        else if(marks >= 75)
            System.out.println("B grade");
        else if(marks >= 55) 
            System.out.println("C grade");
        else if(marks >= 40)
            System.out.println("D grade");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        test10 obj = new test10();
        obj.get();
        obj.display();
    }
}
