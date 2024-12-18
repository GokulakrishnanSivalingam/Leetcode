class Solution {
    public int[] finalPrices(int[] prices) {
           int[] p= new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
         p[i]=prices[i];
         for(int j=i+1;j<prices.length;j++)
         {
                if(prices[i]>=prices[j])
                {
                    p[i]=prices[i]-prices[j];
                    break;
                }
                
         }
        
        }
        return p;
        
    }
}
