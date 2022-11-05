import java.util.Arrays;

public class Bubblesort {

    public static void main (String []args){
        int arr[] = {2,4,5,9,7,1,3,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int arr[]){

        for(int i =0;i<=arr.length;i++){
            for(int j = 1;j<=arr.length -i;j++){
                if(arr[i] < arr[j-1]){
                    int temp = arr[i];
                    arr[i] = arr[j-1];
                    arr[j-1] = temp;
                }


            }
        }
    }
}
