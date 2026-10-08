package Day10;

interface Greeting {
    public void hello();
}

public class test1 {
    public static void main(String[] args) {
        Greeting obj = () -> System.out.println("Hello");
        obj.hello();
    }
}