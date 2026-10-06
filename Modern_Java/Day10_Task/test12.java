
import java.util.function.Consumer;

public class test12 {
    public static void main(String[] args) {
        Consumer<String> ename = name -> System.out.println("Employee name: " + name);
        Consumer<Integer> eid = id -> System.out.println("Employee id: " + id);

        ename.accept("Naman");
        eid.accept(642);
    }
}
