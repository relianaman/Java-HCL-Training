
import java.util.function.Function;

public class test6 {
    public static void main(String[] args) {
        Function<Double, Double> obj = (degree) -> ((degree * 9) / 5 + 32);

        System.out.println(obj.apply(27.0));
        System.out.println(obj.apply(34.0));
    }
}
