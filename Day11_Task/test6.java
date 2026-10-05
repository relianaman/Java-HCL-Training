import java.util.List;
import java.util.stream.Collectors;

public class test6 {
    public static void main(String[] args) {
        List<String> name = List.of("Naman", "Surendra", "Honey");

        List<String> obj = name.stream()
            .filter(s -> s.startsWith("S"))
            .collect(Collectors.toList());
        System.out.println(obj);

    }
}
