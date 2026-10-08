package Day13_Task;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Student {
    String name;
    int salary;

    Student(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class test1 {
    public static void main(String[] args) {
        
        List<Student> students = Arrays.asList(
            new Student("Naman", 52000),
            new Student("Surendra", 52000),
            new Student("Sahil", 42000),
            new Student("Honey", 51000)
        );

        Map<Integer, List<Student>> obj = students.stream()
            .filter(s -> s.getSalary() > 50000)

            .collect(Collectors.groupingBy(s -> s.salary));

        System.out.println(obj);
    }
}
