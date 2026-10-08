package Day14_Task;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your DOB (yyyy-MM-dd): ");
            input = sc.nextLine();
        }

        LocalDate today = LocalDate.now();

        LocalDate dob = LocalDate.parse(input);

        Period age = Period.between(dob, today);

        System.out.println("Age: " + age.getDays() + " days "+ age.getMonths() + " months " + age.getYears() + " years");
    }
}
