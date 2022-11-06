import java.util.Arrays;

public class Pattern {
    // public static void main(String [] args){
    //     ptrn(4);

    // }
    // static void ptrn(int n){
    //     for(int row = 1 ;row <= n; row++){
    //         for(int col = 1;col <= n ; col++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }

    // }
    public static void main(String []args){
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,60}
        };
//        int target = 35;
System.out.println(Arrays.toString(binsrc2d(arr, 25)));


    }
    static int[] binsrc2d (int matrix[][],int target){
        int r = 0;
        int c = matrix.length - 1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int []{r,c};
            }
            if (matrix[r][c] < target) {
                r--;
            }
            else{
                c--;
            }


        }


        return new int []{-1,-1};
    }
}

// out put

//* * * *
//* * * *
//* * * *
//* * * *
