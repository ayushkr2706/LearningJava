package BasicJava.Strings;

public class strings {
    
    public static void main(String[] args) {
        
        // String str1 = "Ayush";
        // String str2 = "Ayush";

        // System.out.println("str1 : " + str1 + " , str2 : " + str2);

        String s1 = "Ayush"; //String Literal obj created inside String pool of Heap memory.
        String s2 = "Ayush"; //Doesn't create new String object as the previous obj is reused and s2 points to s1 obj only.

        String s3 = new String("Ayush");    //Here new String obj is created outside the string pool,
                                            //but inside the regular heap area.

        System.out.println(s1==s2);     //true
        System.out.println(s1==s3);     //false
        System.out.println(s1.equals(s3));  //true
    }
}
