
import java.util.function.Consumer;

public class test8 {
    public static void main(String[] args) {
        Consumer<String> obj = (name) -> System.out.println("Student name: " + name);
    
        obj.accept("Naman");
    }
}
