public class test1 {
    int age;

    test1(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("The age is: " + age);
    }

    public static void main(String[] args) {
        test1 obj = new test1(22);
        obj.display();
    }
}