
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        
        // var name; - not allowed
        var name = "Naman";
        System.out.println(name);
        // var age = null;

        Map<Integer, String> students = new HashMap<>();
        students.put(642, "Naman");
        System.out.println(students);

        // HashMap with var
        // var students = new HashMap<Integer, String>();

        //var with generic collection
        var names = new ArrayList<String>();
        names.add("Naman");
        System.out.println(names.get(0));

    }
}
