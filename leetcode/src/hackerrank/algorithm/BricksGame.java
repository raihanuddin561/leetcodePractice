package hackerrank.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BricksGame {
    public static int bricksGame(List<Integer> arr) {
        List<Integer> removedArr = new ArrayList<>();

        removing(arr,removedArr,true);
        int sumArr = calculate(arr);
        int sumRemArr = calculate(removedArr);

     return 0;
    }

    private static int calculate(List<Integer> arr) {
        return arr.stream().reduce((a,b)->a+b).get();
    }

    private static void removing(List<Integer> arr, List<Integer> removedArr,boolean firstAndLast) {
        if(firstAndLast){
            removedArr.add(arr.remove(0));
            removedArr.add(arr.remove(arr.size()-1));
        }else {
            for(int i=0;i<3;i++){
                removedArr.add(arr.get(i));
            }
        }

    }
}
