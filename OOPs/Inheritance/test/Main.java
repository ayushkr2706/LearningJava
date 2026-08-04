package OOPs.Inheritance.test;

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
class C extends B{
    public void x(){
        System.out.println("inside C x");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        C obj1 = new C();
        obj1.show();
    }
}
