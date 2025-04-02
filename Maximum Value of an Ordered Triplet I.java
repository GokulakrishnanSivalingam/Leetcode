class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    
                     long c=(long)(nums[i]-nums[j])*nums[k];
                    max=Math.max(c,max);
                     
                }
            }
        }
        return max;
    }
}
