
import java.util.*;

public class test10 {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
    
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            String name;
            System.out.print("Enter the number of values: ");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++) {
                System.out.print("Enter the id: ");
                number = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                student.put(number, name);
            }
        }
        System.out.println(student);
    }
}
