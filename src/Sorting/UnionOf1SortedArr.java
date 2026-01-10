package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOf1SortedArr {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> x= new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                x.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                x.add(b[j++]);
                i++;
            }else{
                x.add(b[j++]);
            }
        }
        while (i < a.length) x.add(a[i++]);
        while (j < b.length) x.add(b[j++]);
        return x;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1,2,3};

        ArrayList<Integer> commonElements = commonElements(a, b);

        for (int i : commonElements) {
            System.out.print(i+" ");
        }
    }

}
