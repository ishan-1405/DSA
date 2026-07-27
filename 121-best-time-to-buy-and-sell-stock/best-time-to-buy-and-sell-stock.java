class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int n = prices.length;
        int minsofar = prices[0];

        for(int i=0; i<n; i++){
            int profit;

            // Check today's profit
            profit = prices[i]-minsofar;

            // Compare and store as max profit if it is
            maxprofit = Math.max(profit, maxprofit);

            // Update the minimum so far
            if(prices[i]<minsofar){
                minsofar = prices[i];
            }
        }
        return maxprofit;
    }
}