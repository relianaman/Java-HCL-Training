package Day12;


import java.util.Arrays;
import java.util.List;

public class test12 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40);

        boolean result = number.stream()
            .anyMatch(n -> n>30);

        System.out.println(result);
    }    
}
