package CollectionFramework.Queue.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class linkedList {
    public static void main(String[] args) {
        
         Queue <Integer> q = new LinkedList<>();

        // q.add(10);
        // q.add(20);
        // q.add(30);

        //Instead of add() use offer() in DSA for adding the element in the Queue.

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Before : " + q);

       // System.out.println(q.element());    //Instead of element() use peek() for retrieving the front element of the Queue.

        System.out.println("Front element : " + q.peek());

        // System.out.println(q.remove());     //Instead of remove() use poll() to remove the front element of the Queue.

        System.out.println("Removing : "+ q.poll());

        System.out.println("After : " + q);

        Deque<Integer> dq = new LinkedList<>();

        dq.offer(100);
        dq.offer(200);
        dq.offer(300);

        dq.offerFirst(500);
        dq.offerLast(400);

        System.out.println(dq);

        dq.pollFirst();

        System.out.println("Polling First : "+ dq);
    }
    
}
