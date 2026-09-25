public class test4 {
    String employee_name;
    int salary;
    String dept;


    void display() {
        System.out.println(employee_name);
        System.out.println(salary);
        System.out.println(dept);

    }

    public static void main(String[] args) {
        test4 obj = new test4();
        obj.employee_name = "Naman";
        obj.salary = 100000;
        obj.dept = "Developer";
        obj.display();
    }
}
