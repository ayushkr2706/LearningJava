package BasicJava.Patterns;
import java.util.*;

public class InvertedSolidPyramidPattern {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){

            //spaces
            for(int i=1; i<row; i++){
                System.out.print("  ");
            }

            //stars
            for(int col=1; col<=2*(n-row)+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
