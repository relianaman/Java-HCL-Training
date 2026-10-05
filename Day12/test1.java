
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collecting into list

public class test1 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 3, 6, 9, 11, 13);

        List<Integer> obj = number.stream()
            .filter(x -> x>10)
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
