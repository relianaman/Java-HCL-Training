package Day10_Task;


import java.util.function.Predicate;

public class test5 {
    public static void main(String[] args) {
        Predicate<String> obj = (name) -> (name.length() > 5);

        System.out.println(obj.test("Naman"));
        System.out.println(obj.test("Surendra"));
    }
}
