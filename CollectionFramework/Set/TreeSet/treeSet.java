package CollectionFramework.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
        
        Set<Integer> st2 = new TreeSet<>();     //stores in Sorted order

        st2.add(50);
        st2.add(10);
        st2.add(30);
        st2.add(40);
        st2.add(20);

        System.out.println("Tree Set : " + st2);
    }
    
}
