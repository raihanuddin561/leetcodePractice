package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] board = new boolean[matrix.length][matrix[0].length];
        List<Integer> res = new ArrayList<>();
        int i=0,j=0,rowLength=matrix.length-1,colLength=matrix[0].length-1;
        int cell = matrix.length*matrix[0].length;
        int startRow = i,endRow=rowLength;
        int startCol = j,endCol=colLength;
        while (cell>0){
            i=startRow;
            j=startCol;
            while (j<=endCol && cell>0){
                res.add(matrix[i][j++]);
                cell--;
            }
            j--;
            startRow++;
            i++;
            while (i<=endRow&&cell>0){
                res.add(matrix[i++][j]);
                cell--;
            }
            i--;
            endCol--;
           j--;
           while (j>=startCol&&cell>0){
               res.add(matrix[i][j--]);
               cell--;
           }
           j++;
           endRow--;
           i--;
           while (i>=startRow&&cell>0){
               res.add(matrix[i--][j]);
               cell--;
           }
           i++;
           startCol++;
           j++;
           /* while (j<=colLength){
                if(!board[i][j]){
                    board[i][j]=true;
                    res.add(matrix[i][j]);
                }

                j++;
            }
            j--;
            while (i<=rowLength ){
               if(!board[i][j]){
                   board[i][j]=true;
                res.add(matrix[i][j]);
               };
                i++;
            }
            i--;

                while (j>=0){
                   if(!board[i][j]){
                       board[i][j]=true;
                       res.add(matrix[i][j]);
                   }

                    j--;
                }
                j++;
                while (i>=0){
                    if(!board[i][j]){
                        board[i][j]=true;
                        res.add(matrix[i][j]);
                    }

                    i--;
                }
                i++;
                while (i>=0&&j>=0&&i<=rowLength&&j<=colLength&&board[i][j]){
                    i++;
                    j++;
                }*/


        }
        return res;

    }
}
