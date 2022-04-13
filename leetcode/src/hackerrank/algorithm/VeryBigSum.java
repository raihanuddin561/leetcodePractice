package hackerrank.algorithm;

import java.util.List;

public class VeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(0l,(a,b)->Long.sum(a,b));
    }
}
