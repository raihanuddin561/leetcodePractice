package projecteular;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {
   public static int getSum(List<Integer> arr){
       IntStream intStream = IntStream.range(0,1000);
       intStream = intStream.filter(a->isMultiples(a));
       int sum = intStream.reduce(0,(a,b)->Integer.sum(a,b));
       return sum;
   }

    private static boolean isMultiples(Integer a) {
       if(a%3==0 || a%5==0){
           return true;
       }
       return false;
    }

}
