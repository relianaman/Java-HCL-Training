package Day03_Task;

public class test6 {
    int length;
    int breadth;

    void display() {
        System.out.println("Area: " + (length*breadth));
    }

    public static void main(String[] args) {
        test6 obj = new test6();
        obj.length = 6;
        obj.breadth = 4;
        obj.display();
    }
}
