class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
         int max=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i-1]<prices[i])
            {
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
        
    }
}
