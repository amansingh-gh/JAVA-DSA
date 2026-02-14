package MultiDimensionalArr;

public class RowSum {
    static void main() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 16}};

        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
        int rowSum = 0;
            for(int j=0; j<arr[i].length; j++){
                rowSum+= arr[i][j];
            }
            maxSum=Math.max(maxSum,rowSum);
        }
        System.out.println("Sum of matrix is: "+maxSum);
    }
}