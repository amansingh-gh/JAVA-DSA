package MultiDimensionalArr;

public class PrintColumnWise {
    static void main() {
        int[][]arr = {
                {231, 87, 4, 56},
                {90, 12, 77, 31},
                {65, 8, 44, 99}
        };
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}