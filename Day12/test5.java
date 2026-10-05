
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test5 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 30, 23, 44, 54, 61);
        
        Map<Boolean, List<Integer>> obj = number.stream()
            .collect(Collectors.groupingBy(n -> n%2 == 0));
        
        System.out.println(obj);
    }
}
