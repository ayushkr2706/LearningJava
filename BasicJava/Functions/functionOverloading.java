package BasicJava.Functions;

public class functionOverloading {

    public static void main(String[] args) {
        
        System.out.println(sum(5,6));
        System.out.println(sum(1,2,3));
        System.out.println(sum(2.9, 3.3));
        greet("Ayush", 21);
        greet(21, "Ayush");

    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){ // different number of parameters
        return a + b * c;
    }

    static int sum(double a, double b){ // different types of parameters
        return (int)(a+b);
    }

    static void greet(String name, int age){
        System.out.println("Hi " + name + " " + "Your age is " + age);
    }

    static void greet(int age, String name){
        System.out.println("Hi " + name + " " + "Your age is " + age);
    }
    
}
