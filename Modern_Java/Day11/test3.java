package Day11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test3 {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(List.of("Raj", "Rahul", "Rohan", "Rajeev"));

        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
        
        List<String> obj = names.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());
        System.out.println(obj);
    }
}
