
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test12 {
    public static void main(String[] args) {
        List<Integer> number = List.of(11, 32, 63, 44, 25, 86, 70, 8, 99, 110);

        Stream<Integer> obj = number.stream()
            .filter(x -> x%5 == 0);
            // .count
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
