public class test14 {
    int age;
    String name;

    public test14() {
        age = 23;
        name = "Naman";
    }

    public test14(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        test14 obj = new test14();
        obj.display();

        test14 obj2 = new test14(22, "Surendra");
        obj2.display();
    }
}
