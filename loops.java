import java.util.Scanner;
public class loops
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        for(int i=100;i>=1;--i){     //  i-- also same ans
//            System.out.println(i)
//            };



//        int k = 100;
//        do {
//            System.out.println(k);
//
//            k--;
//        }
//        while (k >= 1);


        int num =0;

        do{
            System.out.print("enter the number : ");
            num = scanner.nextInt();
            System.out.println("Your number is : "+ num);

        } while(num >=0);
            System.out.println("the end");
        }
}


