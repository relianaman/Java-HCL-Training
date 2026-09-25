import java.util.*;

public class test14 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rohan");
        students.put(102, "Rajeev");
        students.put(103, "Raghu");

        for(Integer key : students.keySet()) {
            System.out.println(key);
        }

        for(String value : students.values()) {
            System.out.println(value);
        }

        // for(Map.Entry<Integer, String> entry : students.entrySet()) {
        //     System.out.println();
        // }
    }
    
}
