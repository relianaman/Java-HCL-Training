import java.util.List;
import java.util.stream.Collectors;

public class test7 {
    public static void main(String[] args) {
        List<Integer> number = List.of(11, 25, 13, 48, 50, 16, 87, 98, 69, 10);

        List<Integer> obj = number.stream()
            .filter(x -> x>10)
            .map(x -> x*2)
            .collect(Collectors.toList());
        System.out.println(obj);
            
    }
}
