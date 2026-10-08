package Day13_Task;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override 
    public String toString() {
        return name + " " + salary ;
    }
}

public class test5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Naman", "IT", 70000),
            new Employee("Surendra", "IT", 90000),
            new Employee("Honey", "HR", 50000),
            new Employee("Rahul", "HR", 60000)
        );

        Map<String, Double> totalSalary = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.summingDouble(Employee::getSalary)
            ));

        Map<String, Optional<Employee>> highestPaid = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(
                    Comparator.comparingDouble(Employee::getSalary)
                )
            ));

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Highest paid: " + highestPaid);
    }
}