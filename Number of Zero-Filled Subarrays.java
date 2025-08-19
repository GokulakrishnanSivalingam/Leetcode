class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long c=0,b=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            else
            {
                b+=c*(c+1)/2;
                c=0;
            }
            if(n-1==i &&nums[i]==0)
            {
             b+=c*(c+1)/2;
            }
        

        }
        return b;
    }
}
