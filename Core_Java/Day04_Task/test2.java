package Day04_Task;

public class test2 {
    int age;
    String name;

    test2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);

    }

    public static void main(String[] args) {
        test2 obj = new test2(22, "Naman");
        obj.display();
    }
}
