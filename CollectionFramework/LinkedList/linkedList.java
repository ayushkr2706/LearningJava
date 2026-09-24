package CollectionFramework.LinkedList;
import java.util.*;

public class linkedList{

    public static void main(String [] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(20);

        System.out.println(list);

        list.remove(0); //Remove from index 0
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();

        list2.add(100);
        list2.add(110);
        list2.add(120);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());
        list2.clear();
        System.out.println("list2 size : " + list2.size());

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("Element is : " + it.next());
        }

        Object [] arr = list.toArray();

        for(Object obj : arr){
            System.out.println(obj);
        }

        System.out.println(list.isEmpty());
        System.out.println(!list.isEmpty());
        System.out.println("Printing the list : " + list );
        System.out.println(list.indexOf(30));

        System.out.println("Last occurrence of 20 is : " + list.lastIndexOf(20));

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(10);
        ll.addFirst(9);
        ll.addLast(11);
        System.out.println(ll);

        System.out.println("Peek : " + ll.peek());
        System.out.println("Before : " + ll);
        System.out.println("Polling : " + ll.poll());
        System.out.println("After : " + ll);
        ll.offer(200);
        System.out.println("After offer : " + ll);

    }
}