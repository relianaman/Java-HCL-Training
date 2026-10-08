package Day11_Task;


import java.util.List;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> obj = number.stream()
            .filter(x -> x%2 == 0);
        obj.forEach(System.out::println);
    }
}
