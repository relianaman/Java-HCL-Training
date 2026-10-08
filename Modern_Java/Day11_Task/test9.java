package Day11_Task;

import java.util.List;
import java.util.stream.Collectors;

public class test9 {
    public static void main(String[] args) {
        List<Integer> number = List.of(10, 25, 13, 48, 50, 16, 98, 69, 90);

        List<Integer> obj = number.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(obj);
            
    }
}
