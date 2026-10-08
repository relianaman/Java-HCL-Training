import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        
        String language;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the language: ");
            language = sc.next();
        }

        String type = switch (language) {

            case "Java", "java" -> "Object-Oriented";
            case "Python", "python" -> "Interpreted";
            case "C", "c" -> "Procedural";

            default -> "Unknown";
        };

        System.out.println(type);


    }
}
