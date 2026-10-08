package Day12;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        List<Integer> number = List.of(10, 20, 30, 40, 50, 60);
        
        Set<Integer> obj = number.stream()
            .collect(Collectors.toSet());
        
        System.out.println(obj);
    }
}
