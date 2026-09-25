public class test2 {
    int rollno;

    void display() {
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        test2 obj = new test2();
        obj.rollno = 642;
        obj.display();

        test2 obj2 = new test2();
        obj2.rollno = 643;
        obj2.display();
    }
}
