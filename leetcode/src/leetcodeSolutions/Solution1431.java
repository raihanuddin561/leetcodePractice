package leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(max<=candies[i]+extraCandies)
                list.add(true);
            else list.add(false);
        }
        return list;
    }
}
