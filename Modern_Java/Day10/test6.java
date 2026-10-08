package Day10;


import java.util.function.Predicate;

public class test6 {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = number -> number%2 == 0;

        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(11));
    }
}
