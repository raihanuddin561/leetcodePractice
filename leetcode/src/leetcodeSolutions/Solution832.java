package leetcodeSolutions;

public class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][];
        for (int i=0;i<image.length;i++){
            int[] flip = flipAndInvert(image[i]);
            res[i]=flip;
        }
        return res;
    }

    private int[] flipAndInvert(int[] arr) {
        int l=0,h=arr.length-1;
        while (l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]^1;
        }
        return arr;
    }
}
