package Day04;

public class test2 {
    int rollno;
    String name;

    test2(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("The name is: " + name);
        System.out.println("The roll no is: " + rollno);
    }

    public static void main(String[] args) {
        test2 obj = new test2(642, "Naman");
        obj.display();
    }
}
