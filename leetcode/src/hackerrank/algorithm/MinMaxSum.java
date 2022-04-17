package hackerrank.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
       long min =0;
       long max = 0;
       List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
       int c = sortedList.remove(0);
       max = sortedList.stream().mapToLong(Integer::longValue).reduce((a,b)->a+b).getAsLong();
       sortedList.add(c);
       sortedList = sortedList.stream().sorted().collect(Collectors.toList());
       int d = sortedList.remove(sortedList.size()-1);
       min = sortedList.stream().mapToLong(Integer::longValue).reduce((a,b)->a+b).getAsLong();
        System.out.println(min+" "+max);
    }

    private static long calculate(List<Integer> arr,int i) {
        int c = arr.remove(i);
        List<Integer> arr2 = arr;
        long sum = arr2.stream().mapToLong(Integer::longValue).reduce(0,(a,b)->a+b);
        arr.add(c);
        return sum;
    }



}
