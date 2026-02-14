package MultiDimensionalArr;

import java.util.Scanner;

public class Arr2D {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][2];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
