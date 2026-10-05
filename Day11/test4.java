
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test4 {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(List.of("Raj", "Rahul", "Meet", "Harry"));

        List<String> obj = names.stream()
            .filter(s -> s.startsWith("R"))
            .map(String::toLowerCase)
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
