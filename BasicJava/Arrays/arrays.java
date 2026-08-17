package BasicJava.Arrays;

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

        //Taking values
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

        System.out.println();

        //Jaggered Arrays
        int jag[][] = new int[4][];
        int z = 101;
        for(int row=0; row<4; row++){
            if(row % 2 != 0){
              jag[row] = new int[5];
            }
            else {
               jag[row] = new int[3];
                }

                for(int col=0; col<jag[row].length; col++){
                    jag[row][col] = z;
                    z++;
                }
            }
        

        //Printing the jaggered array
        for(int row=0; row<jag.length; row++){
            for(int col=0; col<jag[row].length; col++){
                System.out.print(jag[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}
