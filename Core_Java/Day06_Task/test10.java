package Day06_Task;

public class test10 {
    public static void main(String[] args) {
        try {
            int marks = 95;

            if(marks < 0 || marks > 100) {
                throw new ArithmeticException("Invalid marks");
            }

            System.out.println("Marks: " + marks);
        } catch (ArithmeticException e) {
            System.out.println("Enter valid marks");
        }
    }
}
