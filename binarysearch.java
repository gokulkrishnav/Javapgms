

import java.util.Scanner;
public class binarysearch {

    public static void main(String [] args){
int arr[] = {-5,-4,-2,3,5,7,8};
int key = 5;
int ans = binsrc(arr,key);
        System.out.println(ans);
    }

    static int binsrc(int arr[], int key){

        int start= 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(key > arr[mid] ){
                start = mid +1;
            }
            else if(key < arr[mid] ){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}