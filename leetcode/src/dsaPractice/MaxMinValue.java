package dsaPractice;

public class MaxMinValue {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, -5, -4, 8, 6};
        int min=minValue(arr,0,Integer.MAX_VALUE);
        int max=maxValue(arr,0,Integer.MIN_VALUE);
        System.out.println("Minimum VAlue: "+min);
        System.out.println("Max VAlue: "+max);
    }
    static int minValue(int[]arr,int i,int min){
        if(arr[i]<min) min=arr[i];
        if(i==arr.length-1) return min;
        return minValue(arr,i+1,min);
    }
    static int maxValue(int[]arr,int i,int max){
        if(arr[i]>max) max=arr[i];
        if(i==arr.length-1) return max;
        return maxValue(arr,i+1,max);
    }
}
