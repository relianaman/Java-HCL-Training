package Day10_Task;


import java.util.function.Predicate;

public class test2 {
    public static void main(String[] args) {
        Predicate<Integer> pos = (number) -> (number>0);
        
        System.out.println(pos.test(10));
        System.out.println(pos.test(-15));
    }
}
