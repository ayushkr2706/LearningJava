package BasicJava.Patterns;
import java.util.*;

public class SolidRightAngleTrianglePattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
