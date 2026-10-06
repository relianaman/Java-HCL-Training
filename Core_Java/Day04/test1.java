public class test1 {
    String name = "Hello";

    void get(String name) {
        System.out.println(this.name);
        System.out.println(name);
    }
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.get("Hey");
    }
}
