package BasicJava.Recursion;

public class recursion01 {
    
    public static void main(String[] args) {
        
        int x = 1;
        int y = 10;
        print(x);
        System.out.println();
        print2(y);
    }

    static void print(int num){
        if(num > 10){
            return;
        }
        System.out.println(num);
        num++;
        print(num);  // Tail Recursion
    }

    static void print2(int num) {
        if(num == 0){
            return;
        }
        print2(num - 1);    // Non-tail Recursion
        System.out.println(num);
}
}
