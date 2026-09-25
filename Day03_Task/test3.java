public class test3 {
    String name;
    int rollno;
    String section;

    void display() {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(section);
    }

    public static void main(String[] args) {
        test3 obj = new test3();
        obj.name = "Naman";
        obj.rollno = 642;
        obj.section = "F";
        obj.display();
    }
}
