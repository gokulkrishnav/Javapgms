import java.util.Scanner;
public class Pattern5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");


            }

            System.out.println("");

        if (i == n) {
            for (int r = 1; r < n; r++) {
                for (int c = r; c < n; c++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
            }
        }
    }

}



//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*