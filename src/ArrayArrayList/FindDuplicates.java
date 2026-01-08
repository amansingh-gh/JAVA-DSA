package ArrayArrayList;

public class FindDuplicates {
    public static int findDuplicate(int[] nums) {
        while(nums[0]!=nums[nums[0]]){
            int correctIdx = nums[0];
            int temp = nums[0];
            nums[0] = nums[correctIdx];
            nums[correctIdx] = temp;
        }
        return nums[0];
    }

    static void main() {
        int[] arr = {3,1,4,4,2};
        int res =findDuplicate(arr);
        System.out.println(res);
    }
}