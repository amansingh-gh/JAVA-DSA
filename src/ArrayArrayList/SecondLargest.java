package ArrayArrayList;

public class SecondLargest {

    public static int secMaxEle(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }
        return secMax;

    }

    static void main() {
        int[] arr = {4, 10, 10, 8, 2};
        int res = secMaxEle(arr);
        System.out.println("Second max element is: " + res);
    }
}