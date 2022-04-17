package hackerrank.algorithm;

import java.util.Comparator;
import java.util.List;

public class BirthdayCandle {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count = candles.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        int counter =0;
        for(int val: candles){
            if(val==count) counter++;
        }
        return counter;
    }
}
