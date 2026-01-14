package Searching;

public class FindSingleElement {
    public static int singleNonDuplicate(int[] arr){
    int n = arr.length;
    if(n==1) return arr[0];
    if(arr[0]!=arr[1]) return arr[0];
    if(arr[n-1]!=arr[n-2]) return arr[n-1];

    int st=0, end=n-1;
    while(st<=end){
        int mid = st+(end-st)/2;;
        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
        int firOcc = mid, secOcc = mid;
        if(arr[mid]==arr[mid-1]) firOcc = mid-1;
        else secOcc = mid+1;

        int leftCnt = firOcc-st;
        int rightCnt = end - secOcc;
        if(leftCnt%2==0) st = secOcc+1;
        else end = firOcc-1;
    }
return -1;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3};

        int result = singleNonDuplicate(nums);

        System.out.println("Single non-duplicate element: " + result);
    }
}