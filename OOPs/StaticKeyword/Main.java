package OOPs.StaticKeyword;

public class Main {

    public static void main(String[] args) {
        


    }
    
}

class Student{

    String name;
    int age; 
    int roll;
    static String college;

    public Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    static{
        //This is a static block.
        college = "NSEC";
    }
}
