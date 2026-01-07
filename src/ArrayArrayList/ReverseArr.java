package ArrayArrayList;

public class ReverseArr {
    static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {6,8,1,2,4,9};
        int st = 0, end = arr.length-1;
            while(st<end){
                swap(arr, st, end);
                st++; end--;
            }

        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
