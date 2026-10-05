
import java.util.List;
import java.util.stream.Stream;

//Stream class example 1

public class test1 {
    public static void main(String[] args) {
        List<Integer> obj = List.of(10, 20, 30);
        System.out.println(obj);

        Stream<Integer> number = obj.stream();
        number = number.filter(x -> x>10);
        number = number.map(x -> x*5);

        number.forEach(System.out::println);
    }
}
