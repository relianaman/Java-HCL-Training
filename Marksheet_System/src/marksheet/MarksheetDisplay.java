package marksheet;

import java.util.List;

public class MarksheetDisplay {

    private List<Marksheet> marksheets;

    public MarksheetDisplay(List<Marksheet> marksheets) {
        this.marksheets = marksheets;
    }

    public void displayAll() {

        Thread thread = new Thread(() -> {

            for (Marksheet marksheet : marksheets) {

                marksheet.display();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        });

        thread.start();
    }

    public void displayOne(int choice) {

        Thread thread = new Thread(() -> {

            switch (choice) {

                case 1 -> marksheets.get(0).display();

                case 2 -> marksheets.get(1).display();

                case 3 -> marksheets.get(2).display();

                case 4 -> marksheets.get(3).display();

                case 5 -> marksheets.get(4).display();

                case 6 -> marksheets.get(5).display();

                default -> System.out.println("Invalid choice.");
            }

        });

        thread.start();
    }
}