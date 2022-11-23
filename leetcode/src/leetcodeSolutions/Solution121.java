package leetcodeSolutions;

public class Solution121 {
   // static int maxProf = 0;
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int profit = 0;
        int l = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<l){
                l = prices[i];
            }
            profit = prices[i]-l;
            if(maxProf<profit){
                maxProf = profit;
            }
        }
        return maxProf;
    }

    private int findMaxProfit(int[] prices, int start,int max) {
        int stockPrice = prices[start];
       // int max = Integer.MIN_VALUE;
        for(int i=start+1;i<prices.length;i++){
            int sell = prices[i];
            if(sell>max) max = sell;
        }
        int profit = max-stockPrice;
       return profit;
    }
}
