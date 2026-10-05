
import java.util.Arrays;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        long Count =  number.stream()
            .filter(n -> n>25)
            .count();
        
        System.out.println("Count: " + Count);
    }
}
