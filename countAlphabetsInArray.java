import java.util.*;
public class countAlphabetsInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
char[] arr = str.toCharArray();
int count = 0;
        for(int i = 0;i < arr.length - 1;i++){
        count = 0;
            for(int j = 0;j < arr.length - 1;j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }

            }
            System.out.println(arr[i] + " :- " + count);
        }
    }
}
