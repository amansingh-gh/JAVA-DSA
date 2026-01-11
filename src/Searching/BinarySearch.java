package Searching;

public class BinarySearch {
    static int binarySrc(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid  = st+(end-st)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                st = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    static void main() {
        int[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,45,80,90,100};
        int target = 45;
        int res =binarySrc(arr,target);
        System.out.println("Element found at index: "+res);
    }
}
