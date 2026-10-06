import java.util.List;
import java.util.stream.Collectors;

public class test8 {
    public static void main(String[] args) {
        List<Integer> number = List.of(10, 25, 13, 48, 50, 16, 98, 98, 69, 10);

        List<Integer> obj = number.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(obj);
            
    }
}
