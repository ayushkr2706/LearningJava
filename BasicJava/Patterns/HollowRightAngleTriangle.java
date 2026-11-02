package BasicJava.Patterns;
import java.util.*;

public class HollowRightAngleTriangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || i==2 || i==n){
                    System.out.print("* ");
                }
                else if(j==1 || j==i){
                        System.out.print("* ");
                    }
                else{
                    System.out.print("  ");
                }    
                

            }
            System.out.println();
        }

    }
    
}
