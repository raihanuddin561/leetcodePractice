package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       List<Integer> arr = makeList(nums1);
       List<Integer> arr2 = makeList(nums2);
       arr.addAll(arr2);
       arr = arr.stream().sorted().collect(Collectors.toList());
       if(arr.size()<=0){
           return 0.0;
       }
      if(arr.size()%2==0){
          int mid = arr.size()/2;
          return (arr.get(mid-1)+arr.get(mid))/2.0;
      }else return arr.get(arr.size()/2);
    }

    List<Integer> makeList(int[] arr){
        return IntStream.of(arr).boxed().sorted().collect(Collectors.toList());
    }
}
