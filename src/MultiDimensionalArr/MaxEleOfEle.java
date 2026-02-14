package MultiDimensionalArr;

public class MaxEleOfEle {
    static void main() {
        int[][]arr = {{231, 87, 4, 56}, {90, 12, 77, 31}, {65, 8, 44, 99}};

        for(int i=0; i<arr.length; i++){
            int rowMax = Integer.MIN_VALUE;
            for(int j=0; j<arr[i].length; j++){
                rowMax = Math.max(rowMax,arr[i][j]);
            }
                System.out.println(rowMax);
        }
    }
}
