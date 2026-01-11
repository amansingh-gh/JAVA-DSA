package Searching;

public class FloorOfNum {
    public static int findFloor(int[] arr, int x) {
        int st=0, end = arr.length-1, idx = -1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]>x){
                end= mid-1;
            }
            if(arr[mid]<=x){
                idx = mid;
                st = mid+1;
            }
        }
        return idx;
    }
    static void main() {
        int[] arr = {1, 2, 4, 6, 10, 12, 14};
        int x = 5;

        int result = findFloor(arr, x);

        if (result == -1) {
            System.out.println("No floor exists for " + x);
        } else {
            System.out.println("Floor of " + x + " is at index " + result + " with value " + arr[result]);
        }
    }
}
