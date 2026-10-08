package Day05;

import java.util.Scanner;

abstract class TV {
    @SuppressWarnings("unused")
    abstract void turnon();
    @SuppressWarnings("unused")
    abstract void turnoff();
} 

class TVRemote extends TV {
    @Override 
    void turnon() {
        System.out.println("TV is turn on");
    }

    @Override 
    void turnoff() {
        System.out.println("TV is turn off");
    }
}

public class test11 {
    public static void main(String[] args) {
        TVRemote obj = new TVRemote();
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("-----Enter your choice-----");
            System.out.println("Press 1 for TV on");
            System.out.println("Press 2 for TV off");
            System.out.println("Press 3 for exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> obj.turnon();
                case 2 -> obj.turnoff();
                case 3 -> System.out.println("Exit");
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
