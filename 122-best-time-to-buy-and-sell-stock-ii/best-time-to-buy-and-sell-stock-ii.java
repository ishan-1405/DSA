class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0; 
        int low=prices[0];
        int high=prices[0];
        int profit=0;

        while(i<n-1){
            //Check for the low point to buy
            while(i<n-1 && prices[i]>=prices[i+1]){
                i++;
            }
            low = prices[i];

            //Check for the high to sell
            while(i<n-1 && prices[i]<=prices[i+1]){
                i++;
            }
            high=prices[i];
            profit += high-low;
        }
        return profit;
    }
}