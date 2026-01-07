package ArrayArrayList;

public class Serogate0s1s {
    static void serogate(int[] arr){
        int st = 0, end = arr.length-1;
        while(st<end){
            if(arr[end]==1){
                end--;
            }else if(arr[st]==0){
                st++;
            }else {
                int temp = arr[st];
                arr[st]=arr[end];
                arr[end] = temp;
                st++; end--;
            }
        }
    }
    static void main() {
        int[] arr = {1,1,1,1,1,0,0,1,1,1};
        serogate(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
