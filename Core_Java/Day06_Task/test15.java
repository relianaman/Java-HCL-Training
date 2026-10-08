package Day06_Task;


import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        try {
            int marks;
            Scanner sc = new Scanner(System.in);
            marks = sc.nextInt();

            if(marks < 0 || marks > 100) {
                throw new Exception("Invalid marks");
            }

            System.out.println("Marks: " + marks);
        } catch (Exception e) {
            System.out.println("Enter valid marks");
        }
    }
}
