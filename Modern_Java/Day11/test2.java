
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Stream class example 2

public class test2 {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>(List.of(10, 20, 30));

        // method 1
        // Stream<Integer> number = obj.stream();
        // number = number.filter(x -> x>10);
        // number = number.map(x -> x/2);
        // number.forEach(System.out::println);

        // method 2
        // obj.stream()
        //     .filter(x -> x>10)
        //     .map(x -> x/2)
        //     .forEach(System.out::println);

        // method 3
        Stream<Integer> number = obj.stream()
            .filter(x -> x>10)
            .map(x -> x/2);
        number.forEach(System.out::println);

    }
}
