package hackerrank.algorithm;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumA = 0,sumB=0;
        for(int i=0;i<arr.size();i++){
            sumA +=arr.get(i).get(i);
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i).get(arr.size()-1-i));
            sumB += arr.get(i).get(arr.size()-1-i);
        }
        System.out.println("SumA: "+sumA);
        System.out.println("SumB: "+sumB);
        return Math.abs(sumA-sumB);

    }
}
