public class test8 {
    int rollno;
    String name;

    test8(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
    }

    public static void main(String[] args) {
        test8 obj = new test8(642, "Naman");
        obj.display();
        test8 obj2 = obj;
        System.out.println("---------------------");
        System.out.println("Name: " + obj2.name + " & Roll no: " + obj2.rollno);
    }
}
