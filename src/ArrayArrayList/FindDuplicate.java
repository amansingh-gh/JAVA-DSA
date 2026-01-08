package ArrayArrayList;

public class FindDuplicate {
    static int findDupli(int[] arr){
        int n = arr.length;
        int missing = -1;
        boolean[] flag = new boolean[n+1];
        for(int i=0; i<n; i++){
            int ele = arr[i];
            if(flag[ele]){
                return ele;
            }else{
                flag[ele] = true;
            }
        }
        return missing;
    }
    static void main() {
        int[] arr= {1,2,3,4,5,5};
        int idx = findDupli(arr);
        System.out.println("Duplicate is: "+idx);

    }

}
