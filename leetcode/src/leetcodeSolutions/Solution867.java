package leetcodeSolutions;

public class Solution867 {
    public int[][] transpose(int[][] matrix) {
        int[][] arr=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int m=j,n=i;
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }

    private int getReverseValue(int[][] matrix) {

        return 0;
    }
}
