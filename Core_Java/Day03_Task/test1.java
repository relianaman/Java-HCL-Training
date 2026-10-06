public class test1 {
    int rollno;

    void display() {
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        test1 obj = new test1();
        obj.rollno = 642;
        obj.display();
    }
}