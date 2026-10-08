package Day06;

public class test8 {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[3]);
            int result = num[1] / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Something else went wrong");
        }
    }
}
