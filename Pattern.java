public class Pattern {
    public static void main(String [] args){
        ptrn(4);

    }
    static void ptrn(int n){
        for(int row = 1 ;row <= n; row++){
            for(int col = 1;col <= n ; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

// out put

//* * * *
//* * * *
//* * * *
//* * * *
