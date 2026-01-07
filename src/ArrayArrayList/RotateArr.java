package ArrayArrayList;

public class RotateArr {
    static void reverse(int[] arr, int i, int j){
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;j--;
        }
    }
    static void rotateArrs(int[] arr, int r){
        int n = arr.length;
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        int r = 2;
        rotateArrs(arr,r);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
