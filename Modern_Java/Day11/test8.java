
import java.util.*;
import java.util.stream.Collectors;

public class test8 {
    public static void main(String[] args) {
        List<Integer> number = List.of(10, 20, 30, 40, 50, 60, 70, 80);

        List<Integer> obj = number.stream()   
            .skip(2)
            .limit(3)
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
