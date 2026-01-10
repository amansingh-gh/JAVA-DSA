package Sorting;

public class KthSmallestEle {
    static int KthFind(int[] arr, int k){

        int n = arr.length;

        for(int i=0; i<k; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr[k-1];
    }
    static void main() {
        int[] arr = {2,3,1,20,15};
        int k = 3;
        int res = KthFind(arr,k);
        System.out.println("The smallest is: "+res);
    }
}
