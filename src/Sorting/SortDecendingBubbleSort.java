package Sorting;

import java.util.Arrays;

import static Sorting.ReSwap.swap;


public class SortDecendingBubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSorted = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]) {
                    swap(arr,j,j+1);
                    isSorted = true;
                }
            }
            if(!isSorted) break;
        }
    }
    static void main() {
        int[] arr = {13,50,1,4,2,0};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
