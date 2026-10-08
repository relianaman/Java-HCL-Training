package Day10_Task;


import java.util.Scanner;

interface Check {
    public void number(int num);
}

public class test1 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            n  = sc.nextInt();
        }
        Check obj = (num) -> {
            if(n%2 == 0)
                System.out.println(n + " is a even number");
        };  
        obj.number(n);
    } 
}
