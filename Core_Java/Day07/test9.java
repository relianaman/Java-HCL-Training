package Day07;


import java.util.*;

public class test9 {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        student.put(101, "Raghu");
        student.put(102, "Rajeev");
        student.put(102, "Rahul");
        student.put(103, "Ravi");
        student.put(104,"Ravi");
        System.out.println(student);

        System.out.println("Student 101: " + student.get(101));

        System.out.println(student.size());


    }
}
