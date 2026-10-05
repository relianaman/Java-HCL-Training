
import java.util.function.Function;

public class test10 {
    public static void main(String[] args) {
        Function<String, Integer> obj = (name) -> (name.length());

        System.out.println(obj.apply("Naman"));
        System.out.println(obj.apply("Surendra"));
    }
}
