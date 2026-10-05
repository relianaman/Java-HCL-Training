
import java.util.function.Function;

public class test7 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (x) -> (x*x);
    
        System.out.println(square.apply(16));
        System.out.println(square.apply(21));
    } 
}
