
import java.util.List;
import java.util.stream.Collectors;

public class test5 {
    public static void main(String[] args) {
        List<String> name = List.of("Naman", "Surendra", "Ravi");

        List<String> obj = name.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(obj);

    }
}
