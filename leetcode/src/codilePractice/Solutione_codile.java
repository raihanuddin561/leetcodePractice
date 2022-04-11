package codilePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutione_codile {
    public int segreget(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                int temp = 0;
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
    public int solution(int[] A) {
            int segreget = segreget(A);
            int[] arr = new int[A.length-segreget];
            int j = 0;
            for(int i = segreget;i<A.length;i++){
                arr[j]=A[i];
                j++;
            }
            return missingPositiveValue(arr);
    }

    private int missingPositiveValue(int[] arr) {
        return 0;
    }
}
