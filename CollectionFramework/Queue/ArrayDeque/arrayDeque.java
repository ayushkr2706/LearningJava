package CollectionFramework.Queue.ArrayDeque;

import java.lang.reflect.Array;
import java.util.*;

public class arrayDeque {
    
    public static void main(String[] args) {
        
        Queue <Integer> q = new ArrayDeque<>();

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

         Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(100);
        dq.offer(200);
        dq.offer(300);

        dq.offerFirst(500);
        dq.offerLast(400);

        System.out.println(dq);

        dq.pollFirst();

        System.out.println("Polling First : "+ dq);
        System.out.println("Peeking Last : " + dq.peekLast());

        System.out.println();

        //Usage of ArrayDeque as a Stack

        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(1000);
        st.push(2000);
        st.push(3000);

        System.out.println("Before Stack : " + st);

        System.out.println("Front element : " + st.peek());

        st.pop();

        System.out.println("After Stack : " + st);
        
    }
    
}
