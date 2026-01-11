package Searching;

public class MaxCntPosNeg {
    public static int maximumCount(int[] arr) {
        int st=0, end = arr.length-1, size = arr.length;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>0){
                end = mid-1;
            }else if(arr[mid]<0){
                st=mid+1;
            }else {
                end = mid-1;
            }
        }
        return Math.max(st, size-st);
    }
    public static void main(String[] args) {

        int[] nums = {-5, -3, -1, 0, 2, 4, 6};

        int result = maximumCount(nums);

        System.out.println("Result: " + result);
    }
}