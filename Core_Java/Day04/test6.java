package Day04;

//current class instance as a paraemter to the constructor

public class test6 {
    int rollno;
    String name;

    test6(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display(test6 obj) {
        System.out.println("The name is: " + obj.name);
        System.out.println("The roll no is: " + obj.rollno);
    }

    void show() {
        display(this);
    }

    public static void main(String[] args) {
        test6 obj = new test6(642, "Naman");
        obj.show();
    }
}
