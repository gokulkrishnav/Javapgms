import java.util.Scanner;
public class reversestring {

    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    char[] chArr = str.toCharArray();

    for(int i = chArr.length - 1; i >=0; i--) {

        System.out.print(chArr[i]);

    }
}
}

