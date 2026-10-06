
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test3 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Naman", "Surendra", "Sahil");
        
        String obj = name.stream()
            .collect(Collectors.joining(", "));
        
        System.out.println(obj);
    }
}
