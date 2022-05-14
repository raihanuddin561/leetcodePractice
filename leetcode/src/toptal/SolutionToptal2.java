package toptal;

import java.util.Arrays;

public class SolutionToptal2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        return Arrays.stream(A).max().getAsInt();

    }
}
