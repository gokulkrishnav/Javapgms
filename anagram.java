import java.util.Arrays;
import java.util.Scanner;
public class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        //convert to lower case

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check if length is same

        if (str1.length() == str2.length()) {

            //convert string into char array
            char arr1[] = str1.toCharArray();
            char arr2[] = str1.toCharArray();


            Arrays.sort(arr1);
            Arrays.sort(arr2);

            Boolean result = Arrays.equals(arr1, arr2);

            if (result) {
                System.out.println("The given String " + str1 + " and " + str2 + " is an anagram");
            } else {
                System.out.println("The given String " + str1 + " and " + str2 + " is not an anagram");
            }

        }
        else {
            System.out.println("The given String " + str1 + " and " + str2 + " is not an anagram");
        }
    }
}
