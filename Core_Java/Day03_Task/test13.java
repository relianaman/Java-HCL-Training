public class test13 {
    int age;
    String name;

    test13(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        test13 obj = new test13(23, "Naman");
        obj.display();
    }

}
