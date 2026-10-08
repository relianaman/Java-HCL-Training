package Day10_Task;


import java.util.function.Function;

public class test9 {
    public static void main(String[] args) {
        Function<Integer, Double> obj = (salary) -> (salary * 1.1);

        System.out.println(obj.apply(11001));
        System.out.println(obj.apply(10000));
    }
}
