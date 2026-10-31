package BasicJava.Patterns;
import java.util.*;

public class SolidRhombus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){

            //spaces
            for(int col=n-1; col>row-1; col--){
                System.out.print(" ");
            }

            //stars
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }

            //spaces
            for(int col=0; col<row-1; col++){
                System.out.print(" ");
            }
            System.out.println();

        }
        sc.close();
    }
    
}
