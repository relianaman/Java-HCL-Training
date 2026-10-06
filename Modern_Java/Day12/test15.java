import java.util.Arrays;
import java.util.List;

public class test15 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(4, 6, 2, 3, 9, 7);     

        // number.stream()
        //     .filter(n -> n>3)
        //     .map(n -> n*2)
        //     .forEach(n -> System.out.println(n));

        //parallel stream
        number.parallelStream()
            .filter(n -> n>3)
            .map(n -> n*2)
            .sorted()
            .forEachOrdered(n -> System.out.println(n));

    }
}