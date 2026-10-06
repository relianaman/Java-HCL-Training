public class test5 {
    String employee_name;
    int salary;
    int incentive;


    void display() {
        System.out.println(employee_name);
        System.out.println("Salary: " + (salary + incentive));

    }

    public static void main(String[] args) {
        test5 obj = new test5();
        obj.employee_name = "Naman";
        obj.salary = 100000;
        obj.incentive = 5000;
        obj.display();
    }
}
