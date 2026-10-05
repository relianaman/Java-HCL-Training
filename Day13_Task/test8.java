import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class test8 {

    static Optional<Employee> findEmployee(List<Employee> employees, int id) {
        return employees.stream()
            .filter(e -> e.id == id)
            .findFirst();
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Naman"),
            new Employee(2, "Rahul"),
            new Employee(3, "Honey")
        );

        Optional<Employee> result = findEmployee(employees, 1);

        if (result.isPresent()) {
            System.out.println(result.get().name);
        } else {
            System.out.println("Employee not found");
        }
    }
}