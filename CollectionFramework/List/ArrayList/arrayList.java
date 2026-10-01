package CollectionFramework.List.ArrayList;

import java.util.*;

public class arrayList{

    public static void main(String [] args){

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

            //add
            list.add(10);
            list.add(20);
            list.add(30);

            list2.add(5);
            list2.add(8);
            list2.addAll(list);

            System.out.println(list.indexOf(10));
            System.out.println("List 1 is : "+ list);
            System.out.println("List 2 is : " + list2);

            Iterator<Integer> it = list.iterator();
            Iterator<Integer> it2 = list2.iterator();

            while(it2.hasNext()){
                System.out.println("Element is : " + it2.next());
            }

            System.out.println();

            while(it.hasNext()){
                System.out.println("Element is : " + it.next());
            }

    }
}