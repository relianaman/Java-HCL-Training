
import java.util.*;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Rohan");
        student.add("Raj");
        student.add("Rahul");

        System.out.println(student);

        System.out.println("First student: " + student.get(0));

        student.set(1, "Ravi");

        student.remove("Rahul");

        student.add(1, "Raghav");

        System.out.println("After modification: " + student);
    }    
}
