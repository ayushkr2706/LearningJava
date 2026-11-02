package BasicJava.Patterns;
import java.util.*;

public class HollowPyramidPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
         //spaces
         for(int j=1; j<=n-i; j++){
            System.out.print("  ");
         }
         //stars
         for(int j=1; j<=2*i-1; j++){
            if(i==1 || i==n){
                System.out.print("* ");
            }
            else if(j==1 || j==2*i-1){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
         }
         System.out.println();
        }

    }
    
}
