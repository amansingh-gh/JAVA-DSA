package ArrayArrayList;

public class MissingInArray {
    static int findMissing(int[] arr){
        long n = arr.length;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for(int i: arr){
            arrSum+=i;
        }
        return (int)(sum-arrSum);
    }
    static void main() {
        int[] arr = {1,2,3,5,6};
        int res = findMissing(arr);
        System.out.println(res);
    }
}
