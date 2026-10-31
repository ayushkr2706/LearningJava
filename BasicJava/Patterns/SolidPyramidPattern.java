package BasicJava.Patterns;
import java.util.*;

public class SolidPyramidPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){

            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            //stars
            for(int col=1; col<2*row; col++){
                System.out.print("* ");
            }

            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }
    
}
