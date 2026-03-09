package QuestionsSolved;

import java.util.Arrays;

public class ReverseArr {
    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void revArr(int[] arr) {
        int st=0, end= arr.length-1;
        while(st<=end){
            swap(arr, st,end);
            st++; end--;
        }
    }
    static void main() {
        int[] arr = {1, 4, 3, 2, 6, 5};
        System.out.println(Arrays.toString(arr));
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
