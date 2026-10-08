package Day06_Task;


import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            try (Scanner sc = new Scanner(System.in)) {
                int i = sc.nextInt();
                System.out.println(num[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
