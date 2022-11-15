import java.util.*;
public class SeparateCharAndInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int temp = 0;


        String st1 = str.replaceAll("[^A-Za-z]","");
        String st2 = str.replaceAll("[^0-9]","");
        System.out.println("String b ="+st1);
        System.out.println("Int c ="+st2);

        }


    }

