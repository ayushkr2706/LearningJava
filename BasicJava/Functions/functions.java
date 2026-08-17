package BasicJava.Functions;
import java.util.Random;

public class functions {
    public static void main(String[] args) {

        greet();
        sayName("Ayush");
        System.out.println(getNum());
        int mul = multiply(5, 4);
        System.out.println(mul);
        
    }
    
    //No Input, No Output function
    static void greet(){
        System.out.println("Hello World");
        return;
    }

    //Input but no Output
    static void sayName(String name){
        System.out.println("Hello " + name);
        return; 
    }

    //No Input but gives Output
    public static int getNum(){
        Random random = new Random();
        int x = random.nextInt();
        return x;
    }

    //Both Input and Output
    static int multiply(int a, int b){
        return a*b;
    }

}
