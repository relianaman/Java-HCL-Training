public class test4 {
    public void get() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        test4 obj = new test4();
        obj.get();
        obj.get();
        obj.set();
        obj.set();
    }

    public void set() {
        System.out.println("I am eating");
    }
}
