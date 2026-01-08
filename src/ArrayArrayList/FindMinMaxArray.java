package ArrayArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinMaxArray {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0];
        int max = arr[0];
        int n =arr.length;

        for(int i=1; i<n; i++){
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
        }
        return new ArrayList<>(Arrays.asList(min,max));
    }

    static void main() {
        int[] arr = {5126, 3939382};
        ArrayList<Integer> ans = getMinMax(arr);
        for(int i: ans){
            System.out.print((i+ " "));
        }
        System.out.println(ans);
    }
}
