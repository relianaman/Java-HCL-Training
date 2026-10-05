
import java.util.function.Predicate;

public class test4 {
    public static void main(String[] args) {
        Predicate<Integer> div = (number) -> (number%5 == 0);

        int i = 10;
        System.out.println("The number " + i + " is divisible by 5: " + div.test(i));
    }
}
