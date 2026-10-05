
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test11 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        Optional<Integer> obj =  number.stream()
            .filter(n -> n>25)
            .findAny();
        
        System.out.println(obj.orElse(-1));
    }
}
