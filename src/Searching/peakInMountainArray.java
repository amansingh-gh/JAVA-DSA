package Searching;

public class peakInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int st=0, end= arr.length-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                st=mid+1;
            }
        }
        return end;
    }
        static void main() {
        int[] arr= {0,1,14,2};
        int idx = peakIndexInMountainArray(arr);
            System.out.println(idx);
    }
}
