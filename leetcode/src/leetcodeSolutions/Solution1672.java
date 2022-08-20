package leetcodeSolutions;

import java.util.Arrays;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int l= accounts.length;
        int max = 0;
        for(int i=0;i<l;i++){
            int[] a = accounts[i];
            int s =Arrays.stream(a).sum();
            if(s>max) max=s;
        }
        return max;
    }
}
