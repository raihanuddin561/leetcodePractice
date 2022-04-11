package codilePractice;

import java.util.Arrays;

public class MissingNumber {
    public int solution(int[] A){
        int missing=0;

        int[] sortedArray = Arrays.stream(A).sorted().toArray();
        int j =sortedArray[0];
        int first = j;
        for(int i=1;i<sortedArray.length;i++){
            if(sortedArray[i]==j){
                j++;
            }
        }
        if(j<=0){
            return 1;
        }else if(first==j){
            return sortedArray[sortedArray.length-1]+1;
        }
        return j;
    }
}
