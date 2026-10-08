package Day12;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test10 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
        
        Optional<Integer> result =  number.stream()
            .filter(n -> n>25)
            .findFirst();
        
        System.out.println(result.orElse(-1));
    }
}
