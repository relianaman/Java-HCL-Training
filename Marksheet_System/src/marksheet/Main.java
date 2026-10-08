package marksheet;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "NAMAN",
                "23BCON0642",
                "NARESH"
        );

        List<Marksheet> marksheets = List.of(
                new Semester1(student),
                new Semester2(student),
                new Semester3(student),
                new Semester4(student),
                new Semester5(student),
                new Semester6(student)
        );

        MarksheetDisplay display = new MarksheetDisplay(marksheets);

        System.out.println("""
                
                ==========================================
                       MARKSHEET DISPLAY SYSTEM
                ==========================================
                1. Semester 1
                2. Semester 2
                3. Semester 3
                4. Semester 4
                5. Semester 5
                6. Semester 6
                ==========================================
                """);

        System.out.print("Enter your choice: ");

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> input = executor.submit(() -> {

            Scanner scanner = new Scanner(System.in);

            return scanner.nextLine();

        });

        try {

            String value = input.get(20, TimeUnit.SECONDS);

            int choice = Integer.parseInt(value);

            display.displayOne(choice);

        } catch (TimeoutException e) {

            System.out.println("""
                    
                    No input received for 20 seconds.
                    Displaying all semester marksheets...
                    """);

            display.displayAll();

        } catch (Exception e) {

            System.out.println("Invalid input.");

        } finally {

            executor.shutdownNow();
        }
    }
}