class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int count=0;
        long tot=0,s=0;
    for(int num:nums)
    {
        tot+=num;
    }
        for(int i=0;i<n-1;i++)
        {
            
            s+=nums[i];
             long s1=tot-s;
        
        if(s>=s1)
        {
            count++;
        }
        }
        return count;
    }
}
