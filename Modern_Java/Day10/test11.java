
import java.util.ArrayList;
import java.util.function.Consumer;

public class test11 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        Consumer<Integer> obj = num -> System.out.println(num);

        // number.forEach(obj);

        for(int num : number) {
            obj.accept(num);
        }
    }
}
