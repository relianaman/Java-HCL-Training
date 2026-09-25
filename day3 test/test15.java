public class test15 {
    int sum;

    test15(int a, int b) {
        sum = a+b;
    }

    test15(int x, int y, int z) {
        sum = x+y+z;
    }

    void display() {
        System.out.println("Sum of numbers: " + sum);
    }

    public static void main(String[] args) {
        test15 obj = new test15(10, 15);
        obj.display();

        test15 obj2 = new test15(10, 15, 20);
        obj2.display();
    }
}
