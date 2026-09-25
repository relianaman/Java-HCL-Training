public class test7 {
    int radius;

    void area() {
        System.out.println("Area: " + (3.14*radius*radius));
    }

    void circumference() {
        System.out.println("Circumference: " + (2*3.14*radius));
    }

    public static void main(String[] args) {
        test7 obj = new test7();
        obj.radius = 7;
        obj.circumference();
        obj.area();
    }
}
