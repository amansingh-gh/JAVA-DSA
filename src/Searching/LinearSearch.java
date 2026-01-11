package Searching;

public class LinearSearch {
    public static void linearSearch(int[] arr, int target){
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Found at index: "+i);
                flag = true;
                break;
            }
        }
        if(flag)System.out.println("Target found");
        else System.out.println("Target not found");
    }
    static void main() {
        int[] arr = {20,50,9,70,6,80,1};
        int target = 9;
        linearSearch(arr,target);
    }
}
