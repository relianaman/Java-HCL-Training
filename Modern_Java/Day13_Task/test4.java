import java.util.*;
import java.util.stream.Collectors;

public class test4 {
    public static void main(String[] args) {

        String sentence = "java is easy java is powerful";

        String[] words = sentence.split(" ");

        Map<String, Long> result = Arrays.stream(words)
            .collect(Collectors.groupingBy(
                word -> word,
                Collectors.counting()
            ));

        System.out.println(result);
    }
}