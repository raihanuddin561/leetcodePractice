package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(checkValue(matrix,matrix[i][j],i,j)) list.add(matrix[i][j]);
            }
        }
        return list;
    }

    private boolean checkValue(int[][] matrix, int val,int row,int col) {
        int r=0,c=0;
        boolean minOfRow=true,maxOfCol=true;
        while (c<matrix[row].length){
            if(val>matrix[row][c]) minOfRow = false;
            c++;
        }
        while (r<matrix.length){
            if(val<matrix[r][col]) maxOfCol = false;
            r++;
        }
        return (minOfRow && maxOfCol);
    }
}
