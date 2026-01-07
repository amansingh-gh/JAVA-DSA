package ArrayArrayList;

import java.util.ArrayList;

public class ArrayListBasics {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(30);
        arr.add(20);
        arr.add(10);
        arr.add(100);
        arr.set(0 ,50);

        System.out.println(arr);

        System.out.println("Reversing Array: ");

        int i=0, j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++; j--;
        }

        System.out.println(arr);
    }
}
