package PracticeJava;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr = {4,2,6,3,6,1};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                System.out.println(Arrays.toString(arr));
                System.out.println("comparing between "+arr[j]+" and "+arr[j+1]);
                //int a = 0;
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}