package OOPs.Inheritance.thisSuper;

class A{
    public A(){
        System.out.println("A constructor");
    }
    public A(int n){
        System.out.println("A parameterized constructor");
    }
}
class B extends A{

    public B(){
        System.out.println("B constructor");
    }
    public B(int n){
        
        // super(n);
        this();
        System.out.println("B parameterized constructor");
    }
}
public class Main {
    //Every constructor has a super() method in it.
    // super() is used to call the constructor of the parent class from the child class.
    //Every class in java extends the Object class.
    //this() is used to call the constructor of the same class.
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
