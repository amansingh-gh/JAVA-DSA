package MultiDimensionalArr;

public class PrintColumnWise {
    static void main() {
        int[][]arr = {
                {231, 87, 4, 56, 11},
                {90, 12, 77, 31},
                {65, 8, 44, 99}
        };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}