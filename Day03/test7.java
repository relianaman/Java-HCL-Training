public class test7 {
    int rollno;
    String name;

    test7(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
    }

    public static void main(String[] args) {
        test7 obj = new test7(642, "Naman");
        obj.display();
    }
}
