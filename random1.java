import java.util.Scanner;
public class random1 {

    public static void main(String [] args) {
//        int arr1[] = {1, 3, 4, 5};
//        int arr2[] = arr1;
//         arr1[0] = 20;
//        System.out.println(arr2[0]);

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0;i < arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0 ;i < arr.length;i++){
            System.out.println(arr[i]);

        }



    }
}
