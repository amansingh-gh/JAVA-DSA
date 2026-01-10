package Sorting;

import java.util.Arrays;
import java.util.Collections;

import static Sorting.ReSwap.swap;

public class MoveAllZerosToEnd {
    static void zeroToEnd(int[] arr){
        int n = arr.length;

        // TLE
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-1-i; j++){
//                if(arr[j]==0){
//                    swap(arr,j,j+1);
//                }
//            }
//        }

        // Optimized
       int j=0;
       for(int i=0; i<n; i++){

           if(arr[i]!=0){
               swap(arr,i,j);
                j++;
           }
       }
    }
    static void main() {
        int[] arr = {1,0,-2,30,0,4,8,0,10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        zeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
