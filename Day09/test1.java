import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<int[]> lst = new ArrayList<>();
        int count = 0;

        while(true) {
            lst.add(new int[250000]);
            count++;
            System.out.println("Allocated blocks: " + count);
        }
    }
}