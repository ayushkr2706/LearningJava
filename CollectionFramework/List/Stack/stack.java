package CollectionFramework.List.Stack;
import java.util.*;

public class stack{

    public static void main(String [] args) {

        List<Integer> st = new Stack<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(20);
        st.add(20);

        System.out.println(st);

        st.remove(0); //Remove from index 0
        System.out.println(st);

        List<Integer> st2 = new Stack<>();

        st2.add(100);
        st2.add(110);
        st2.add(120);

        st.addAll(st2);
        System.out.println("After adding st2 to st : " + st);

        st.removeAll(st2);
        System.out.println("After removing st2 elements from st : " + st);

        System.out.println("Size of st : " + st.size());
        st2.clear();
        System.out.println("st2 size after clearing : " + st2.size());

        Iterator<Integer> it = st.iterator();

        while (it.hasNext()) {
            System.out.println("Element is : " + it.next());
        }

        Object[] arr = st.toArray();

        for (Object obj : arr) {
            System.out.println(obj);
        }

        System.out.println(st.isEmpty());
        System.out.println(!st.isEmpty());
        System.out.println("Printing the stack : " + st);
        System.out.println("First occurrence of 30 is : " + st.indexOf(30));

        System.out.println("Last occurrence of 20 is : " + st.lastIndexOf(20));

        //Sorting
        Collections.sort(st);
        System.out.println("After Sorting : " + st);

        Stack <Integer> st3 = new Stack<>();

        st3.push(10);
        st3.push(20);
        st3.push(30);

        System.out.println("Before Pop : " + st3);
        st3.pop();
        System.out.println("After Pop : " + st3);

        System.out.println("Peek : " + st3.peek());

        System.out.println("Search 10 : " + st3.search(10));
        System.out.println("Empty or not : " + st3.empty());

    }
}