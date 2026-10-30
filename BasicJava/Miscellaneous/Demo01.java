package BasicJava.Miscellaneous;

public class Demo01 {

    public static void main(String[] args) {
        
        int x = 10;
        Integer y = x;  //Auto-boxing
        //behind the scenes the compiler does 
        //Integer y = Integer.valueOf(x);

        Integer a = 10;   //Autoboxing
        int b = a;  //Unboxing
        //behind the scenes it does 
        //int a = Integer.intValue();

        /**The Integer class would look like :
        class Integer {
        
        int value;

        Constructor

     public Integer(int value){
            this.value = value;
    }
            public static Integer valueOf(int value){
                this.value = value;
                return this.value;
            }

            public static int intValue(){
                return this.value;
            }
    
    } **/
    }
    
}




//1. Why one public class per java file. 
//--> So that JVM should know which class has the main method so that it can execute the main method.


//2. Why name of that public class should be same as filename.
//--> So that the Java compiler and development tools can
// easily locate the source file corresponding to a public
// class.