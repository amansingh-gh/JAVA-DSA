package Sorting;

import java.util.Arrays;

public class TwoSumUsingTwoPointer {
    public static boolean twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target) return true;
            else if (arr[i]+arr[j]>target) j--;
            else if (arr[i]+arr[j]<target) i++;
        }
        return false;
    }
    static void main() {
        int[] arr= {7,0,4,3,2,8,10};
        int target = 9;
        boolean res = twoSum(arr,target);
        System.out.println(res);
    }
}
