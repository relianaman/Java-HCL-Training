import java.util.*;
import java.util.stream.Collectors;

public class test9 {
    public static void main(String[] args) {
        List<List<String>> listofLists = List.of(
            List.of("Java", "Python", "Student"),
            List.of("C", "C++", "student", "Spring Boot"), 
            List.of("Linux", "Windows", "stuck")
        );

        Set<String> intermediateResults = new LinkedHashSet<>();

        List<String> result = listofLists.stream()
            .flatMap(List::stream) // nested list
            .filter(s -> s.startsWith("S")) // keeps string start with S
            .map(String::toUpperCase) // convert to uppercase
            .distinct() // remove duplicate
            .sorted()
            .peek(intermediateResults::add)
            .collect(Collectors.toList());
            
        System.out.println(intermediateResults);
        System.out.println(result);
    }
}