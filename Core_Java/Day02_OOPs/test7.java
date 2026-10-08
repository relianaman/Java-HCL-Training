package Day02_OOPs;


import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        String id = "admin";
        String password = "naman";

        String i,p;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the id: ");
            i = sc.nextLine();
            System.out.print("Enter the password: ");
            p = sc.nextLine();
        }
        if(id.equals(i) && password.equals(p)) 
            System.out.println("Door Unlocked");
        else
            System.out.println("No entry");

    }
}
