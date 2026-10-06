@FunctionalInterface 
interface myAdd {
    public void add(int a, int b);
}

public class test3 {
    public static void main(String[] args) {
        myAdd obj1 = (a, b) -> System.out.println(a + b);
        obj1.add(5, 10);
        obj1.add(20, 30);
    }
}