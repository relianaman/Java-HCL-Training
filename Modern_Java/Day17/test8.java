import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        
        int marks;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks: ");
            marks = sc.nextInt();
        }

        String result = switch (marks/10) {
            case 10, 9 -> {
                System.out.println("Excellent Performance");
                yield "Grade A+";
            }

            case 8 -> {
                yield "Grade A";
            }

            case 7 -> {
                yield "Grade B";
            }

            case 6 -> {
                yield "Grade C";
            }

            case 5 -> {
                yield "Grade D";
            }

            case 4 -> {
                yield "Grade E";
            }

            default -> {
                yield "Fail";
            }
        };

        System.out.println(result);
    }
}
