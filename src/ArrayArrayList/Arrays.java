package ArrayArrayList;

import java.util.Scanner;

public class Arrays {
    static void main() {
    Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print("Enter the value of "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            System.out.println("Values are: "+i);
        }
    }
}
