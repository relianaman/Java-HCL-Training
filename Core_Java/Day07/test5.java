package Day07;


import java.util.*;

public class test5 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Jaipur");
        cities.add("Kolkata");
        cities.add("Pune");

        cities.addFirst("Mumbai");
        cities.addLast("Shimla");

        System.out.println(cities);

        cities.removeFirst();
        cities.removeLast();

        System.out.println(cities);
    }
}
