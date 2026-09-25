public class test3 {
    test3() {
        this(10);
        System.out.println("Default Constructor");
    }

    test3(int a) {
        System.out.println("Parameterized Constructor " + a);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        test3 obj = new test3();
    }
}
