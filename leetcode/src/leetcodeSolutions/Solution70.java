package leetcodeSolutions;

public class Solution70 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int temp = 0;
        if(n<=2) return n;
        else{
            for(int i = 3;i<=n;i++){
                temp = second;
                second+=first;
                first = temp;
            }
        }
        return second;
    }
}
