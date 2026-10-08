package Day02_OOPs;


import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the age of the person: ");
            age = sc.nextInt();
        }
        if(age>=18 && age<=100) 
            System.out.println("The person is eligible to vote");
        else
            System.out.println("The person is not eligible to vote");
    }
}
