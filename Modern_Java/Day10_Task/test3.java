package Day10_Task;


import java.util.function.Predicate;

public class test3 {
    public static void main(String[] args) {
        Predicate<Integer> check = (age) -> (age >= 18);

        System.out.println(check.test(22));
        System.out.println(check.test(10));

    }

}
