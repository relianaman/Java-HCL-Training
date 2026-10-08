package Day10_Task;


import java.util.function.Consumer;

public class test14 {
    public static void main(String[] args) {
        Consumer<Integer> obj = (price) -> System.out.println(price * 0.9);

        obj.accept(100);
    }
}
