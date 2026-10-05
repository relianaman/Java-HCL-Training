
import java.util.Arrays;
import java.util.List;

public class test9 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        int max =  number.stream()
            .filter(n -> n>25)
            .max(Integer::compareTo)
            .orElse(0);
        
        System.out.println("Maximum: " + max);
    }
}
