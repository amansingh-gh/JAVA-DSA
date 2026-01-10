package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
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
               i++;
            }else{
                j++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int a[] = {3, 6, 1, 7, 9, 8, 2, 2};
        int b[] = {9, 7, 3, 4, 9};

        ArrayList<Integer> commonElements = commonElements(a, b);

        for (int i : commonElements) {
            System.out.print(i+" ");
        }
    }

}
