package ArrayArrayList;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    static List<int[]> twoSum(int[] arr, int target){
        List<int[]> results = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    results.add(new int[]{i,j});
                }
            }
        }
        return results;
    }
    static void main() {
        int[] arr = { 12, 7, 3, 9, 14, 6, 1, 8, 5, 10,
                2, 11, 4, 13, 15, 0, -1, -3, 16, 18,
                20, -5, 25, 30, -10, 17, 19, 21, 22, 23,
                24, 26, 27, 28, 29, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
                46, 47, 48, 49, 50, 5, 7, 9, 11, 13};
        int target = 20;
        List<int[]> pairs = twoSum(arr,target);

        for(int[] pair: pairs){
            System.out.println("Pairs at index: "+pair[0]+" "+pair[1]);
        }
    }
}
