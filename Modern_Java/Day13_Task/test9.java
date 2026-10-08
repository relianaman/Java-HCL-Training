package Day13_Task;

import java.util.*;

public class test9 {
    public static void main(String[] args) {
        List<Integer> numbers =
            Arrays.asList(10, 20, 30, 30, 40, 40, 50);

        Optional<Integer> secondHighest = numbers.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();

        System.out.println(secondHighest.orElse(-1));
    }
}