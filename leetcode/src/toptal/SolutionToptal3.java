package toptal;

public class SolutionToptal3 {
    public int solution(int[] A, int S) {
        // write your code in Java SE 8
        //int sum = 0;
        int fragment = 0;
        for(int i=0;i<A.length;i++){
           double sum = 0;
            int counter=0;
           for(int j=i;j<A.length;j++){
               counter++;
               sum+=A[j];
               double val = sum/counter;
               if(val==S) fragment++;
           }
        }
        return fragment;
    }
}
