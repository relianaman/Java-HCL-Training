
import java.util.function.Consumer;

public class test11 {
    public static void main(String[] args) {
        Consumer<String> obj = name -> System.out.println(name);

        obj.accept("Naman");
        obj.accept("Surendra");
    }
}
