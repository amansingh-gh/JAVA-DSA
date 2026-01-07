package ArrayArrayList;

public class FindMxEle {
    static void main() {
        int arr[] = {10,5,1,36,15,9};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
            System.out.println("Max element is: "+max);
    }
}
