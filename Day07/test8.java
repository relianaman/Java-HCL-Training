
import java.util.TreeSet;

public class test8 {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();

        num.add(50);
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(10);

        System.out.println(num);
        System.out.println(num.descendingSet());
    }
}
