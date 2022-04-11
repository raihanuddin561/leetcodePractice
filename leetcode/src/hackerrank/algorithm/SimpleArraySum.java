package hackerrank.algorithm;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

 public class SimpleArraySum {
    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum =ar.stream().reduce(0,(a, b)->Integer.sum(a,b));
        return sum;

    }

}

