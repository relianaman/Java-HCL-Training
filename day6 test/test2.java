public class test2 {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[3]);
            System.out.println(10/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        } catch (ArithmeticException e) {
            System.out.println("Not divide by zero");
        }
    }
}
