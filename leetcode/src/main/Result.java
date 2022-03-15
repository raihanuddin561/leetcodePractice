package main;

import leetcodeSolutions.Solution1;
import leetcodeSolutions.Solution1_1;

public class Result {
    public static void main(String[] args) {
        Solution1_1 s1 = new Solution1_1();
        int[] input = {3,2,3};
        int[] result=s1.twoSum(input,6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
