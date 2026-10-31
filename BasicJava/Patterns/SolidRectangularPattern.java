package BasicJava.Patterns;
import java.util.*;

public class SolidRectangularPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int columns = sc.nextInt();

        for(int row=0; row<rows; row++){
            for(int col=0; col<columns; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
