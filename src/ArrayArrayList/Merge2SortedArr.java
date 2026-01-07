package ArrayArrayList;

public class Merge2SortedArr {

    public static void merge(int[] ans, int[] a, int[] b){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                ans[k++] = a[i++];
            }else{
                ans[k++] = b[j++];
            }
        }
        while (i<a.length){
            ans[k++] = a[i++];
        }
        while (j<b.length){
            ans[k++] = b[j++];
        }
    }

    static void main() {
        int[] arr1={2,5,6,5};
        int[] arr2={1,3,5,4,7,8};

        int [] ans = new int[arr1.length+arr2.length];

        merge(ans,arr1,arr2);

        for (int i: ans){
            System.out.print(i+" ");
        }

    }
}
