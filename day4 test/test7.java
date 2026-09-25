public class test7 {
    void m1() {
        this.m2();
        System.out.println("Method 1");
    }

    void m2() {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        test7 obj = new test7();
        obj.m1();
    }
}
