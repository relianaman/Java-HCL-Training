
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Naman");
        student.add("Nishant");
        student.add("Honey");
        student.add("Saniya");
        student.add("Sanjana");
        student.add("Rudra");
        student.add("Nikhil");
        student.add("Rahul");
        student.set(6,"Surendra");
        student.remove("Rahul");

        for(String x : student) {
            System.out.println(x);
        }
    }    
}
