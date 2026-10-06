import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class test2 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Naman", 75),
            new Student("Sahil", 55),
            new Student("Honey", 90),
            new Student("Rahul", 65)
        );

    
        List<Student> result = students.stream()
            .filter(s -> s.marks > 60)
            .collect(Collectors.toList());

        System.out.print("Above 60: ");

        for (Student s : result) {
            System.out.print(s.name + " ");
        }

        System.out.println();
        
        double average = students.stream()
            .mapToInt(s -> s.marks)
            .average()
            .orElse(0);

        System.out.println("Average = " + average);

        
        Student highest = students.stream()
            .max((a, b) -> a.marks - b.marks)
            .orElse(null);

        System.out.println("Highest marks = " + highest.name);
    }
}