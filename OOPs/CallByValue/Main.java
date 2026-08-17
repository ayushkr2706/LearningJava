package OOPs.CallByValue;

public class Main {
    
    public static void main(String[] args) {
        
        Random r1 = new Random(4,5);
        addTen(r1);
        System.out.println(r1.x + " " + r1.y);
        Random r2 = new Random(r1); //Deep Copy
        Random r3 = r1;     //Shallow Copy


    }

    //Java does not support Call By Reference.
    static void addTen(Random r){
        //this is also call by value but here Reference variable is passed
        r.x = r.x + 10;
        r.y = r.y + 10;

    }
}

class Random{

    int x;
    int y;

    public Random(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
