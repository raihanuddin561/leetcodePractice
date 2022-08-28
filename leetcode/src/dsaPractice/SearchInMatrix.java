
package dsaPractice;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
       int[] index= search(arr,49);
        System.out.println(index[0]+","+index[1]);

    }
    static int[] search(int[][] mat,int target){
        int r=0,c=mat[0].length-1;
        while (r<mat.length&&c>=0){
            if(mat[r][c]==target){
                return new int[]{r,c};
            }else if(mat[r][c]>target) c--;
            else r++;
        }
        return new int[]{-1,-1};
    }
}
