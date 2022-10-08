import java.util.Scanner;
public class StringPalindrome {

    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
String s = "";
String str= sc.nextLine();

char CharArr[] = str.toCharArray();

for(int i = CharArr.length-1;i>=0;i--){
    s += CharArr[i];
}
        if(s.equals(str)){
            System.out.println("it is a palindrome");
        }
        else System.out.println("not a palindrome");
    }


}
