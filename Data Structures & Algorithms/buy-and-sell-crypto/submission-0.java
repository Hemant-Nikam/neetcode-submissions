class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while(r < prices.length){
            if(prices[l] > prices[r]){
                l = r;
                r++;
            }else{
                int profit = prices[r] - prices[l];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
                r++;
            }
        }
        return maxProfit;
    }
}