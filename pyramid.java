/*
construct a pyramid
*
**
***
****  USE
 for(i=1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");  // only print to print in same line
            }
            System.out.println();

1
12
123
1234  USE
 for(i=1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);  // only print to print in same line
            }
            System.out.println();

1
22
333
4444  USE
 for(i=1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);  // only print to print in same line
            }
            System.out.println();

2
23
345
4567  USE
 for(i=1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+i);  // only print to print in same line
            }
            System.out.println();
 */





import java.util.Scanner;

public class pyramid {

    public static void main(String [] args){
        int i,j,n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        for(i=1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");  // only print to print in same line
            }
            System.out.println(); // println to move to next line
        }
    }
}
