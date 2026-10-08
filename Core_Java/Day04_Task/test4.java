package Day04_Task;

public class test4 {
    test4() {
        this(10);
        System.out.println("Constructor 1");
    }

    test4(int a) {
        this("Naman");
        System.out.println("Constructor 2 " + a);
    }

    test4(String name) {
        System.out.println("Constructor 3 " + name);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        test4 obj = new test4();
    }
}
