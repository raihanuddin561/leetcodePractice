package leetcodeSolutions;

import java.util.Arrays;

public class Solution1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat.length!=target.length) return false;
        if(mat[0].length!=target[0].length) return false;
        if (isEqual(mat,target)) return true;
        for(int i=0;i<3;i++){
            mat=transpose(mat);
            if(isEqual(mat,target)) return true;
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }

    private int[][] transpose(int[][] mat) {
        int[][] arr=new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            int col= mat.length-1-i;
            for(int j= 0;j<mat.length;j++){
                arr[j][col]=mat[i][j];
            }
        }
        return arr;
    }
}
