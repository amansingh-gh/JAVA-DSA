package ArrayArrayList;

import java.util.Arrays;

public class ReversingArr {
    static void rev(int[]arr){
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    static void main() {
        int []arr = {10,20,30,40,50};

        System.out.println("Before reversing" + Arrays.toString(arr));
        rev(arr);
        System.out.println("After reversing" + Arrays.toString(arr));
    }
}
