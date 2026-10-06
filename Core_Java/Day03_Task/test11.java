public class test11 {
    int age;
    String name;

    test11() {
        age = 23;
        name = "Naman";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        test11 obj = new test11();
        obj.display();
    }
}
