package MultiDimensionalArr;

public class SumOfMatrix {
    static void main() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 16}};
        int sum = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+= arr[i][j];
            }
        }
        System.out.println("Sum of matrix is: "+sum);
    }
}