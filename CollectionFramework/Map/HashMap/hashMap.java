package CollectionFramework.Map.HashMap;

import java.util.*;
import java.util.HashMap;

public class hashMap {
   
    public static void main(String[] args) {
        
        Map<String, String> mpp = new HashMap<>();

        //insertion
        mpp.put("in", "India");
        mpp.put("en", "England");
        mpp.put("us", "United States");

        System.out.println(mpp);

        Map<String, String> mpp2 = new HashMap<>();

        mpp2.put("br", "Brazil");
        System.out.println("Before : " + mpp2);

        mpp2.putAll(mpp);
        System.out.println("After : " + mpp2);

        System.out.println("Size is : " + mpp2.size());

        mpp2.remove("en");
        System.out.println("After removing : " + mpp2); 

        // mpp2.clear();
        // System.out.println("After clearing size : " + mpp2.size());

        mpp2.putIfAbsent("in", "India2");
        System.out.println(mpp2);

        System.out.println(mpp2.get("br"));

        System.out.println(mpp2.getOrDefault("sp", "Does not exist"));

        System.out.println(mpp2.containsKey("in"));

        mpp2.replace("in", "Bharat");
        System.out.println("After replacing : " + mpp2);

        System.out.println("Keyset : " + mpp2.keySet() );
        System.out.println("Values : " + mpp2.values());
        System.out.println("Entry Set : " + mpp2.entrySet());

        for(Map.Entry<String, String> entry : mpp2.entrySet()){
            System.out.println("Key : " + entry.getKey() + " , Value : " + entry.getValue());
        }
    }
}
