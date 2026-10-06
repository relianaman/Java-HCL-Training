
import java.util.*;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Integer> employee = new ArrayList<>();
        employee.add(1005);
        employee.add(1006);
        employee.add(1010);
        employee.add(1001);

        
        for(int x : employee) {
            if(x < 1005) {
                employee.remove(x);
            }
        }

        System.out.println(employee);
    }    
}
