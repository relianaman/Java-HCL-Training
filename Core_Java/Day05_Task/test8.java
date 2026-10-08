package Day05_Task;

class cal {
    
    cal(int a, int b) {
        System.out.println(a+b);
    }

    cal(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    cal(double a, double b) {
        System.out.println(a*b);
    }

}

public class test8 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        cal obj1 = new cal(10, 20);
        @SuppressWarnings("unused")
        cal obj2 = new cal(10, 20, 30);
        @SuppressWarnings("unused")
        cal obj3 = new cal(10.0, 20.0);
    }
}
