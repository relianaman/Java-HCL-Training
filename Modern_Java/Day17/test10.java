enum Level {
    LOW, MEDIUM, HIGH
}

public class test10 {
    public static void main(String[] args) {
        
        Level level = Level.HIGH;

        String message = switch (level) {
            case LOW -> "Low Priority";

            case MEDIUM -> "Medium Priority";

            case HIGH -> "High Priority";

        };

        System.out.println(message);
    }
}
