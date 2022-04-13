package hackerrank.algorithm;

import java.util.List;

public class CompareTriplet {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int alice =0,bob=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }else if(a.get(i)<b.get(i)){
                bob++;
            }
        }
        return List.of(alice,bob);

    }
}
