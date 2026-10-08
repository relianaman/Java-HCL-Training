
import java.util.*;

record StudentA(int id, String name) {
    
}

public class test17 {
    public static void main(String[] args) {
        
        List<StudentA> students = List.of(
            new StudentA(101, "Naman"),
            new StudentA(102, "Surendra"),
            new StudentA(103, "Honey")
        );

        for(StudentA s : students) {
            System.out.println(s.id() + " " + s.name());
        }
    }
}
