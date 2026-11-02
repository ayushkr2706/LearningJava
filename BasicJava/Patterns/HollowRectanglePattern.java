package BasicJava.Patterns;
import java.util.*;

public class HollowRectanglePattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int columns = sc.nextInt();

        for(int i=1; i<=rows; i++){
            if(i==1 || i==rows){
                //print * on all columns
                //else print * only on first and last columns
                for(int j=1; j<=columns; j++){
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }

            for(int j=1; j<=columns; j++){
                if(j==1 || j==columns){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();

        }

    }
    
}
