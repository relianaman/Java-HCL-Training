
import java.util.Arrays;
import java.util.List;

public class test8 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        int min =  number.stream()
            .filter(n -> n>25)
            .min(Integer::compareTo)
            .orElse(0);
        
        System.out.println("Minimum: " + min);
    }
}
