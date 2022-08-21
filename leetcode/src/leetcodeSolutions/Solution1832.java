package leetcodeSolutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toUpperCase().toCharArray();
        int[] nums=IntStream.range(0,chars.length).map(i->chars[i]).sorted().distinct().toArray();
        if(nums.length<26) return false;
        for (int i= 65,j=0;i<91;i++,j++){
            if(nums[j]!=i) {
                System.out.println("not matched!");
                return false;
            }
        }
        return true;
    }
}
