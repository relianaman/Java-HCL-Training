
import java.util.*;
import java.util.stream.Collectors;

public class test7 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(25, 46, 55, 10, 88, 78, 20));

        List<Integer> obj = number.stream()   
            .filter(x -> x>20)
            .sorted()
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
