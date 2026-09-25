
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    String course;
    int marks;

    void get() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the name: ");
            name = sc.nextLine();
            System.out.print("Enter the rollno: ");
            rollno = sc.nextInt();
            System.out.print("Enter the cousre: ");
            course = sc.nextLine();
            System.out.print("Enter the marks: ");
            marks = sc.nextInt();
        }
        System.out.println();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class test2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.get();
        obj.display();
    }
}
