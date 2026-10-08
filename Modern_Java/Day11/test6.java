package Day11;


import java.util.*;
import java.util.stream.Collectors;

public class test6 {
    public static void main(String[] args) {
        List<List<String>> lsitofList = new ArrayList<>(List.of(
            List.of("Java", "Python"),
            List.of("C", "C++"), 
            List.of("Linux", "C++", "Java")
        ));

        List<String> result = lsitofList.stream()
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());
        System.out.println(result);
    }
}
