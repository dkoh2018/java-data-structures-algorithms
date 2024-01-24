import java.util.PriorityQueue;

public class PriorityQueueExample{
    public static void main(String [] arg) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.poll());
    }    
}