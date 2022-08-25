package leetcodeSolutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1854 {
    public int maximumPopulation(int[][] logs) {
      int[] count =new int[101];
      for(int i=0;i<logs.length;i++){
          for(int j=logs[i][0];j<logs[i][1];j++){
              count[j-1950]++;
          }
      }
      int index=0,max=0;
      for(int i=0;i<count.length;i++){
          if(count[i]>max){
              max = count[i];
              index=i;
          }

      }
      return index+1950;
    }
}
