import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            i = sc.nextInt();
        }
        int res = 0;
        while(i > 0) {
            res = res*10 + i%10 ;
            i = i/10;
        }
        System.out.println(res);
    }
}
