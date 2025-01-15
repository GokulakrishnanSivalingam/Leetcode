class Solution {
    public int missingNumber(int[] nums) {
         Arrays.sort(nums);
        int c=0;
          int n=nums.length;
          for(int i=0;i<n;i++)
          {
            if(nums[i]!=i)
            return i;
            else if (nums[i]!=n)
                  c++;
          }
          return c;
          
    }
}
