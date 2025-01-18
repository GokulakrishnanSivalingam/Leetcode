class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
           s+=nums[i];
        }
        int N=0,sum=0;
         for(int digit:nums)
         {
            N=N*10+digit;
            
         
         while(N>0)
         {
            
            sum+=N%10;
            N/=10;
         }
         }
         return s-sum;

        
    }
}
