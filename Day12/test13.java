
import java.util.Arrays;
import java.util.List;

public class test13 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40);

        boolean result = number.stream()
            .allMatch(n -> n>0);

        System.out.println(result);
    }    
}
