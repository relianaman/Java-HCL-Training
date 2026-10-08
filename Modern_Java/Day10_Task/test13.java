package Day10_Task;


import java.util.ArrayList;
import java.util.function.Consumer;

public class test13 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        Consumer<Integer> obj = num -> System.out.println(num);

        for(int num : number) {
            obj.accept(num);
        }
    }
}
