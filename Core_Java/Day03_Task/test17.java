package Day03_Task;

public class test17 {
    int age;
    String name;

    test17(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        test17 obj = new test17(23, "Naman");
        obj.display();
        System.out.println();
        test17 obj2 = new test17(22, "Surendra");
        obj2.display();
    }
}
