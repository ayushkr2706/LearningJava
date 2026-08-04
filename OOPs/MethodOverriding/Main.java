package OOPs.MethodOverriding;

class A{
    public void show(){
        System.out.println("A show");
    }
    public void config(){
        System.out.println("A config");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("B show");
    }

}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
