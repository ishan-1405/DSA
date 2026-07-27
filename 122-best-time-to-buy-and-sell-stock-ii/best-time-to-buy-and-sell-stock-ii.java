class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int n = prices.length;
        int lmax = prices[0];
        int lmin = prices[0];
        int i = 0;
        while(i<n-1){
            // find local minima
            while(i<n-1 && prices[i+1]<=prices[i]){
                i++;
            }
            if(i==n-1){
                break;
            }
            lmin = prices[i];

            // find local maxima
            while(i<n-1 && prices[i+1]>=prices[i]){
                i++;
            }
            lmax = prices[i];

            // add the profit 
            profit += lmax - lmin;
        }
        return profit;
    }
}