package ArrayArrayList;

import java.util.Vector;

public class AddingOne {
    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] ans = new int[n+1];
        ans[0]=1;
        return ans;
    }
    static void main() {
        int[] arr = {9, 9, 9};   // test case
        int[] result = plusOne(arr);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
