package leetcodeSolutions;

public class Solution69 {
    public int mySqrt(int x) {
        return  sqrt(x);
      /*  if (x == 0 || x == 1) return x;
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            //long val=mid*mid;
            if(mid == x / mid){
                return mid;
            }
            else if(mid > x / mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;*/
    }

    private int sqrt(int x) {
        int s=0,end=x;
        double root=0.0;
        while (s<=end){
            int mid = s+(end-s)/2;
            if(mid==x/mid) return mid;
           else if(mid>x/mid) end=mid-1;
            else s=mid+1;
        }
      return end;
    }
}
