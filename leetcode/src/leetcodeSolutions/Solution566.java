package leetcodeSolutions;

public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       if(mat.length*mat[0].length!=r*c){
           return mat;
       }
       int[][] arr = new int[r][c];
       for(int i=0;i<r*c;i++){
           arr[i/c][i%c]=mat[i/mat[0].length][i%mat[0].length];
       }
       return arr;
    }
}
