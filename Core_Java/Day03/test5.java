package Day03;

public class test5 {
    public void get(String name1) {
        System.out.println(name1 +" is dancing");
    }

    public void set(String name2) {
        System.out.println(name2 + " is eating");
    }

    public static void main(String[] args) {
        test5 obj1 = new test5();
        obj1.get("Naman");
        obj1.set("Naman");

        test5 obj2 = new test5();
        obj2.get("Surendra");
        obj2.set("Surendra");
    }
}
