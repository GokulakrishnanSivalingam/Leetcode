class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++ )
            {
                
                if(nums[j-1]>nums[j])
                {
                    t=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=t;

                }
            }
        }
              for(int i=0;i<n;i++)
              {
                System.out.print(nums[i]);
              }



        
    }
}
