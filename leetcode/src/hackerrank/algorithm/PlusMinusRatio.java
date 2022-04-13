package hackerrank.algorithm;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinusRatio {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double size = arr.size();
       double v1 =arr.stream().filter(k->k>0).count();
       double v2 =arr.stream().filter(k->k<0).count();
       double v3 =arr.stream().filter(k->k==0).count();
       double ratio1= v1/size,ratio2=v2/size,ratio3=v3/size;
        System.out.println(String.format("%.6f",ratio1));
        System.out.println(String.format("%.6f",ratio2));
        System.out.println(String.format("%.6f",ratio3));

    }
}
