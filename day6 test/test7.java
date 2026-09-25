
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        try {
            String num;
            try (Scanner sc = new Scanner(System.in)) {
                num = sc.nextLine();
            }
            int i = Integer.parseInt(num);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
