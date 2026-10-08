package Day06_Task;

public class test9 {
    public static void main(String[] args) {
        int age = 15;

        if(age < 18) {
            throw new ArithmeticException("Age must be above 18");
        }

        System.out.println("Eligible");
    }
}
