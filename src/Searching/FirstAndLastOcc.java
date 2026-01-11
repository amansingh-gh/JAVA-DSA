package Searching;

import java.util.ArrayList;

public class FirstAndLastOcc {
    static ArrayList<Integer> binarySrc(int[] arr, int target){
        ArrayList<Integer> occ = new ArrayList<>();
        int st = 0, end = arr.length-1;
        int firstOcc = -1, lastOcc=-1;
        while(st<=end){
            int mid  = st+(end-st)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                st = mid+1;
            }else {
                firstOcc = mid;
                end = mid-1;
            }
        }
        st = 0; end = arr.length-1;
        while(st<=end){
            int mid  = st+(end-st)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                st = mid+1;
            }else {
                lastOcc = mid;
                st = mid+1;
            }
        }
        occ.add(firstOcc);
        occ.add(lastOcc);
        return occ;
    }
    static void main() {
        int[] arr= {1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5};
        int target = 5;
        ArrayList<Integer> res =binarySrc(arr,target);
        System.out.println(res);
    }
}
