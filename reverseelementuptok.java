import java.util.*;
public class reverseelementuptok {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 4, 5, 6, 7, 8, 3, 4, 5, 6};
        int k = sc.nextInt();

        for (int i = 0; i < k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
