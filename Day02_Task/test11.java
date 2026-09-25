import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            i = sc.nextInt();
        }

        int temp = i;
        int res=0;

        while(i > 0) {
            res = res*10 + i%10 ;
            i = i/10;
        }

        if(res == temp)
            System.out.println("The number is palindriome");
        else
            System.out.println("The number is not palindriome");
    }
}
