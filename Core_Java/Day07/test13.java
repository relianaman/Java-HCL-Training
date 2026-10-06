
import java.util.PriorityQueue;

public class test13 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        
        pqueue.offer(50);
        pqueue.offer(10);
        pqueue.offer(30);
        pqueue.offer(20);

        System.out.println(pqueue);

    }
}
