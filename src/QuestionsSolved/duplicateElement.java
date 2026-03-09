package QuestionsSolved;

import java.util.Arrays;

public class duplicateElement {
    public static int findDupli(int []nums){
        while(nums[0]!=nums[nums[0]]){
            int correctIndex = nums[0];

            int temp = nums[0];
            nums[0] = nums[correctIndex];
            nums[correctIndex] = temp;
        }
        return nums[0];
    }
    static void main() {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDupli(nums));
    }
}
