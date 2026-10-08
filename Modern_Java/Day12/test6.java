package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test6 {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(Arrays.asList("Rahul", "Raaj", "Rohan"));

        names.stream()
        // .forEach(name -> System.out.println(name));
        .forEach(System.out::println);
    }
}
