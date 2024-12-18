class Solution {
    public int removeDuplicates(int[] nums) {
        int c=nums.length;
        int k=1;
        for(int i=1;i<c;i++)
        {
            
                if(nums[i]!= nums[i-1])
                {
                    nums[k]=nums[i];
                  k++;
                }
               
            
        }
    return k;
    }
}
