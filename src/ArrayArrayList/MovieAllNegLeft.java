package ArrayArrayList;

public class MovieAllNegLeft {
    public static int[] move(int[] arr){
        int j=0, n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
return arr;
    }
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}