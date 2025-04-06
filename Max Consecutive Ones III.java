class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,max=0;
        for(int i=0;i<n;i++)
        {
            int zero=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                {
                    zero++;
                }
                if(zero<=k)
                {
                   int len=j-i+1;
                    max=Math.max(max,len);
                }
                else
                {
                    break;
                }
            }
    
     }
       return max; 
    }

}
