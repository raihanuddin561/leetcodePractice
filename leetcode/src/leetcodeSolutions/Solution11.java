package leetcodeSolutions;

import java.util.Arrays;

public class Solution11 {
    public int maxArea(int[] height) {
        Long startTime = System.nanoTime();
        int max = 0;
        int maxArea = 0;
        /*if(height.length==2){
            return Arrays.stream(height).min().getAsInt()*1;
        } else if (height.length<2) {
            return 0;
        }*/
        int start = 0, end = height.length-1;
        while (start<end){
           int area = minVal(height[start],height[end])*(end-start);
          // int area = Integer.min(height[start],height[end])*(end-start);

            maxArea = maxVal(maxArea,area);
           // maxArea = Integer.max(maxArea,area);
            if(height[start]>height[end]){
                end--;
            }else {
                start++;
            }
        }
        /*for(int i=0;i<height.length;i++){
            int counter =i+1;
            while (counter<height.length){
                if(height[i]>height[counter]) max = height[counter];
                else max = height[i];
                int newMaxArea = max*(counter-i);
                if(newMaxArea>maxArea){
                    maxArea = newMaxArea;
                }
                counter++;
            }

        }*/
        Long endTime = System.nanoTime();
        System.out.println("Execution time: "+(endTime-startTime));
        return maxArea;
    }

    private int maxVal(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    private int minVal(int a,int b){
        if(a>b){
            return b;
        }
        return a;
    }
}
