package BasicJava.Miscellaneous;

public class Demo02 {

    public static void main(String[] args) {
        
        int x = 100;
        int y = 100;

        Integer a = 200;
        Integer b = 200;

        System.out.println(x==y);

        System.out.println(a==b);
        System.out.println(a.intValue() == b.intValue());
        System.out.println(a.equals(b));

        Integer i = 100;
        Integer j = 100;
        System.out.println(i==j);   //returns true due to Integer caching from -128 to 127.
    }
    
}
