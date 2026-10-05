
import java.util.function.Supplier;

public class test9 {
    public static void main(String[] args) {
        Supplier<String> studentName = () -> "Naman";

        System.out.println("Student name: " + studentName.get());
    }
}
