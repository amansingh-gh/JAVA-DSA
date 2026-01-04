package ArrayArrayList;

public class FIndMaxEle {
    static int findMax(int arr[]) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static void main() {
        int arr[] = {10, 20, 30, 80, 50, 90};
        int res = findMax(arr);
        System.out.println("max ele is : " + res);
    }
}