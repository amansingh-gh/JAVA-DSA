package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {8, 4, 1, 9, -3, 6, 5,-2    };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n-1; i++){
        int minEle = Integer.MAX_VALUE;
        int minIdx = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<minEle){
                    minEle = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}