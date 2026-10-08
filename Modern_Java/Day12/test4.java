package Day12;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class test4 {
    public static void main(String[] args) {
        
        List<Student> students = Arrays.asList(
            new Student("Naman", 22),
            new Student("Surendra", 22),
            new Student("Sahil", 21),
            new Student("Honey", 21)
        );

        Map<Integer, List<Student>> obj = students.stream()
            .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(obj);
    }
}
