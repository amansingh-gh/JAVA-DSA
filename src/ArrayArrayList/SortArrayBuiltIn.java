package ArrayArrayList;

import java.util.Arrays;
public class SortArrayBuiltIn {
    static void main() {
        int a[] = {5,4,9,2,30,70,-8};
        Arrays.sort(a);
        for(int i: a){
            System.out.println("The value are : "+i);
        }
    }
}
