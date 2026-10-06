class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println();
    }
}

public class test1 {
    public static void main(String[] args) {
        Student obj1 = new Student("Naman", 42);
        obj1.display();

        Student obj2 = new Student("Rahul", 23);
        obj2.display();
    }
}