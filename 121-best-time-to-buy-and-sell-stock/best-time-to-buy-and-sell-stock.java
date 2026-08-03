class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int bestBuy = prices[0];
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            bestBuy= Math.min(bestBuy, prices[i]);
            if(prices[i]>bestBuy){
                maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
            }
        }
        return maxProfit;
    }
}