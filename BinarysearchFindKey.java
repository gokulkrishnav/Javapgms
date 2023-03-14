

public class BinarysearchFindKey {

    public static void main(String[] args) {

        int[] arr = {-1,3,5,7,9,12,23,45,67,78,90};
        int key = 12;
        int start = 0;
//        int mid =0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = (start + end) / 2;

         if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else{
                System.out.println(mid);
                break;
            }


        }


    }
}
