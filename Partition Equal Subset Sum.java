class Solution {
    private int sumOf(int[] nums)
    {
        int sum = 0;
        for(int num:nums)
        sum += num;
        return sum;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = sumOf(nums);
        if((sum & 1) == 1) return false;
        sum = sum/2;
        boolean[] prev = new boolean[sum+1];
        prev[0] = true;
        boolean[] curr = new boolean[sum+1];
        curr[0] =true;
        if(nums[0]<=sum) prev[nums[0]] = true;
        for(int i=1;i<n;i++)
        {
            for(int k=1;k<=sum;k++)
            {
                boolean dont = prev[k];
                boolean pick = false;
                if(nums[i]<=k) pick = prev[k-nums[i]];
                curr[k] = (pick || dont);
            }
            boolean[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[sum];
    }
}
