package leetcodeSolutions;

public class Solution69 {
    public int mySqrt(int x) {
        int mid=x/2;
        if(mid*mid==x) return mid;
        return sqrt(x,mid);
    }

    private int sqrt(int x, int mid) {
        mid=mid/2;
        int res=mid*mid;
        if(res==x) return mid;
        return 0;
    }
}
