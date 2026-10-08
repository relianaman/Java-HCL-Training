package Day11_Task;

import java.util.List;
import java.util.stream.Collectors;

public class test10 {
    public static void main(String[] args) {
        List<String> name = List.of("Naman", "Surendra", "Honey");

        List<String> obj = name.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(obj);

    }
}
