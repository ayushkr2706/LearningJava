package BasicJava;

public class arrays {
    public static void main(String[] args) {
        
        int [] nums = new int[4];  //Array Declaration + Creation 
        int x = 101;

        //Assigning the values
        for(int i=0; i<4; i++){
            nums[i] = x;
            x++;
        }

        //Printing the array
        for(int i=0; i<4; i++){   // for(int i=0; i<nums.length; i++){}
            System.out.println(nums[i]);
        }

        //Finding the length of the array
        System.out.println(nums.length);

        //Printing ArrayIndexOutOfBoundsException
        // System.out.println(nums[4]);

        //2D Arrays
        int [][] marks = new int[3][3];

        int y = 101;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                marks[i][j] = y;
                y++;
            }
        }

        //Printing the 2D array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
