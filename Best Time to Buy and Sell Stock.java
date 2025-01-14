class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
         int max=0;
         int n= arr.length;
         for(int i=0;i<n;i++)
         {
            int cost=arr[i]-min;
            max=Math.max(cost,max);
            min=Math.min(arr[i],min);
         }
         return max;
        
    }
}
