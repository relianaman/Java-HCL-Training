
import java.util.function.Consumer;

public class test15 {
    public static void main(String[] args) {
        Consumer<Double> obj = (marks) -> System.out.println(marks >= 33 ? "Pass" : "Fail");

        obj.accept(80.0);
    }
}
