import java.util.*;
public class Array_sortedor_not {
    public static void main(String []args){
        int arr[]={2,4,3,6,7,8,9};
        sortedarray(arr);
    }
    static void sortedarray(int arr[]){
       for(int i =0;i <= arr.length -1;i++){
           for(int j = 1;j < arr.length ;j++){
               if(arr[i] > arr[j]){
                   System.out.println("not sorted");

               }
               else  {
                   System.out.println("sorted array");

               }
           }
       }
    }

}
