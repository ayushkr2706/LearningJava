package OOPs.Inheritance.types;

public class Main {
    //1. Single Inheritance
    //One child inherits from one parent

    //2. Multilevel Inheritance
    //Chain of inheritance

    //Hierarchical Inheritance
    //One parent, multiple children

    //4. Multiple Inheritance --> Java allows it using interfaces.
    //One child inherits from multiple parents


    public static void main(String[] args) {
        Calc obj = new Calc();
        int res1 = obj.add(5, 6);
        int res2 = obj.sub(231,93);
        System.out.println(res1 + " " + res2);
        System.out.println("Yaha tak Calc obj tha, ab aage AdvCalc object rhega");
        AdvCalc obj1 = new AdvCalc();
        int res3 = obj1.add(5, 6);
        int res4 = obj1.sub(7,3);
        int res5 = obj1.mul(2,3);
        int res6 = obj1.div(9,3);
        System.out.println(res3 + " " + res4 + " " + res5 + " " + res6);
    }
}
