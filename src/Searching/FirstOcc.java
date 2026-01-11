package Searching;

public class FirstOcc {
    static int binarySrc(int[] arr, int target){
        int st = 0, end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid  = st+(end-st)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                st = mid+1;
            }else {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    static void main() {
        int[] arr= {1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5};
        int target = 5;
        int res =binarySrc(arr,target);
        System.out.println("Element found at index: "+res);
    }
}
