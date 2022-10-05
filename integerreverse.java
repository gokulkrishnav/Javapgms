import java.util.Scanner;
public class integerreverse {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int rev = 0;
    int temp = num;

    while(temp > 0){
      int n = temp % 10;

      rev = rev * 10 + n ;
      temp = temp / 10;
        }
    if (rev == num){
        System.out.println("It is a palindrome");
    }
    else {
        System.out.println("Not a Palindrome");
    }

    }

}
