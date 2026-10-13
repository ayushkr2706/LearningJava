package CollectionFramework.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {

    public static void main(String[] args) {
        
              Set<Integer> st = new LinkedHashSet<>();    //Preserves the order

        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);

        System.out.println("Linked Hash Set : " + st);
    }
    
}
