public class test16 {
    int age;
    String name;

    test16(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        test16 obj = new test16(23, "Naman");
        obj.display();
    }
}
