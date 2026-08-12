package BasicJava;

public class typePromotion {
    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234; //0.1234

        double result = (f*b) + (i/c) - (s*d);
        //f*b --> float
        //i/c --> integer
        //s*d --> double
        //float + integer --> float 
        //float - double --> double

        System.out.println(f*b + " + " + i/c + " - " + s*d);
        System.out.println("Result : " + result);

    }
}
