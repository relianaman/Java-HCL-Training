public class test10 {
    public static void main(String[] args) {
        Calculator c = new Addition();
        int sum = c.calculate(10, 20);
        System.out.println("Sum: " + sum);
    }
}

@FunctionalInterface 
interface Calculator {
    int calculate(int a, int b);
}

class Addition implements Calculator {
    @Override 
    public int calculate(int a, int b) {
        return a+b;
    }
}