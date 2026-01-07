package ArrayArrayList;

public class ReverseMthNthPoint {
    static void revArrs(int[] arr, int m, int n){
        while(m<n){
           int temp = arr[m];
           arr[m]=arr[n];
           arr[n] = temp;
           m++; n--;
        }
    }
    static void main() {
        int ar[] = {3,19,56,9,83,18,24,85,14};
        int m = 2, n = 5;
        revArrs(ar,m,n);
        for(int i: ar){
            System.out.print(i+ " ");
        }
    }
}
