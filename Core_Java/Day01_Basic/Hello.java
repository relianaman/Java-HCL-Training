package Day01_Basic;

import java.util.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int x, y, a, b, c, d, e;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the values of x : ");
            x = sc.nextInt();
            System.out.print("Enter the values of y : ");
            y = sc.nextInt();
        }
        a = x + y;
        System.out.println("The sum is : " + a);
        b = x - y;
        System.out.println("The difference is : " + b);
        c = x * y;
        System.out.println("The product is : " + c);
        d = x / y;
        System.out.println("The divide is : " + d);
        e = x % y;
        System.out.println("The remainder is : " + e);

        int z = 10;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);
    }
}
