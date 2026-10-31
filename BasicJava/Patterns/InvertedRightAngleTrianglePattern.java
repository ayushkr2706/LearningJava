package BasicJava.Patterns;
import java.util.*;

public class InvertedRightAngleTrianglePattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
