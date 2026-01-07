package ArrayArrayList;

public class WaveArr {
    static void waveArr(int[] arr){
        int n=arr.length-1;
        int i = 0;

//        for(i=0; i<n-1; i+=2){
//            if(arr[i]<arr[i+1]){
//                int temp = arr[i];
//                arr[i] =arr[i+1];
//                arr[i+1] = temp;
//            }
//        }

        while(i<n){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] =arr[i+1];
                arr[i+1] = temp;
            }
                i+=2;
        }
    }
    static void main() {
        int[] arr = {1,2,3,4,5};
        waveArr(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
