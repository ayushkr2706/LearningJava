package OOPs.Inheritance.types;

public class AdvCalc extends Calc {
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a , int b){
        if(b == 0){
            System.out.println("Division by zero not possible");
            return -1;
        }
        else return a/b;
    }
}
