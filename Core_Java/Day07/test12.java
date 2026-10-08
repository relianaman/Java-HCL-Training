package Day07;

import java.util.LinkedList;
import java.util.Queue;

public class test12 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("Rahul");
        queue.offer("Rajeev");
        queue.offer("Rohan");

        System.out.println(queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println(queue);
    }
}
