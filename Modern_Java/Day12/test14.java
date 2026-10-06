
import java.util.Arrays;
import java.util.List;

public class test14 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(-10, 10, 20, 30, 40);

        boolean result = number.stream()
            .noneMatch(n -> n<0);

        System.out.println(result);
    }    
}
