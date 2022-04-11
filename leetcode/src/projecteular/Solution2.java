package projecteular;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    static int m = 1, n = 2, s = m+n,sum=0;
    public static int sumOfFibonacci(){
        if(m%2==0) sum+=m;
        if(n%2==0) sum+=n;
        if(s%2==0) sum+=s;
        System.out.print(m+","+n+","+s);
        getFibonacci(7);
        return sum;
    }

    private static void getFibonacci(int number) {
      //  if (number>0){
      //  if (s<=40000000){
            m = n;
            n = s;
            s = m+n;
            System.out.print(","+s+",");

            if(s<=40000000){
                if(s%2==0) sum +=s;
                getFibonacci(number-1);
            }
        //}
    }

}
