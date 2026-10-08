package Day13_Task;

import java.util.*;
import java.util.stream.*;

public class test6 {
    public static void main(String[] args) {

        // 1. Stream from a List
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.stream()
            .filter(n -> n > 20)
            .forEach(System.out::println);

        // 2. Stream from an Array
        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr)
            .map(n -> n * n)
            .forEach(System.out::println);

        // 3. Stream.of()
        Stream.of("Java", "Python", "C++")
            .filter(s -> s.length() > 3)
            .forEach(System.out::println);

        // 4. Stream.generate()
        Stream.generate(() -> 10)
            .limit(3)
            .forEach(System.out::println);

        // 5. Stream.iterate()
        Stream.iterate(1, n -> n + 1)
            .limit(5)
            .forEach(System.out::println);
    }
}