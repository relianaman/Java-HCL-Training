
import java.util.function.Supplier;

public class test17 {
    public static void main(String[] args) {
        Supplier<String> obj = () -> "Welcome";

        System.out.println(obj.get());
    }
}
