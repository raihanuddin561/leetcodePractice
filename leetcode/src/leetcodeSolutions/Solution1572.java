package leetcodeSolutions;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n =mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[n-i-1][i];
        }
        if(n%2==1) sum-=mat[n/2][n/2];
        return sum;
    }
}
