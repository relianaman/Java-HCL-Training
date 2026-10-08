package Day07_Task;


import java.util.*;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> student = new ArrayList<>();
        student.add(97);
        student.add(94);
        student.add(93);
        student.add(91);

        float sum = 0;
        for(int x : student) {
            sum = sum + x; 
        }

        System.out.println("Average: " + sum/(student.size()));
    }    
}
