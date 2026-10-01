package CollectionFramework.Queue.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        
        //Default behaviour of priority queue -> min heap (smallest elements will have a higher priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(0);
        pq.offer(-5);
        pq.offer(5);
        pq.offer(-8);

        System.out.println("Before PriorityQueue : " + pq);

        System.out.println("Removing the smallest element : " + pq.poll());

        System.out.println("After PriorityQueue : " + pq);
        System.out.println();

        //Now this behaves like a max heap (greatest element will have a higher priority)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        pq2.offer(10);
        pq2.offer(0);
        pq2.offer(-5);
        pq2.offer(5);
        pq2.offer(-8);
        
        System.out.println("Before PriorityQueue(Max Heap) : " + pq2);

        System.out.println("Removing the largest element : " + pq2.poll());

        System.out.println("After PriorityQueue(Max Heap) : " + pq2);

    }
    
}
