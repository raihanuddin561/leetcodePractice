package codilePractice;

import java.util.Arrays;

public class PollutionFilter {
    public int solution(int[] A) {
        double total = Arrays.stream(A).sum();
        double capability = total/2;
        double reduce =0;
        int counter = 0;
        double rest = 0;
        for(int i=0;i<A.length;i++){
          reduce = reduce+A[i]+rest;
          if(reduce==capability){
              counter++;
              reduce = 0;
          }else if(reduce>capability){
              reduce = reduce-A[i] + A[i]/2;
              rest = A[i]/2;
              counter++;
          }

        }
        return counter;

    }

    private int check(double capability, int pollution,int reduce,int rest,int counter) {
       counter++;
        if(reduce<capability){
            reduce = reduce + pollution+rest;
        }else {
            rest = pollution/2;
            pollution = pollution - rest;
            check(capability,pollution,reduce,rest,counter);
        }
        return counter;
    }
}
