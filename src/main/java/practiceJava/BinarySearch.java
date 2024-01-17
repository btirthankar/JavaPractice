package practiceJava;

public class BinarySearch {
    public static void main(String[] args) {
        int[] aa = new int[5];
        int[] arr = {1,4,6,7,12,45,34,56,75,84};
        System.out.println(binarySearch(arr, 56));
    }

    public static int binarySearch(int[] arr, int a){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low + high) /2;
            if (arr[mid]== a)
                return mid;
            else if (arr[mid]<a)
                low= mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}