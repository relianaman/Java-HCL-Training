
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            i = sc.nextInt();
        }

        if(i%2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}