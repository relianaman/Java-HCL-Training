package Day03_Task;

public class test18 {
    int age;
    String name;

    test18(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        test18 obj = new test18(23, "Naman");
        obj.display();
        System.out.println("-------------");
        test18 obj2 = obj;
        System.out.println("Name using copy constructor: " + obj2.name);
    }
}
