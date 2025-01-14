class Solution {
    public void sortColors(int[] nums) {
        int mid=0,low=0,high=nums.length-1;
        int t=0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                t=nums[low];
                nums[low]=nums[mid];
                nums[mid]=t;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                                t=nums[mid];
                                nums[mid]=nums[high];
                                nums[high]=t;
                                high--;
            }
            
        }
        System.out.print(nums);


            }
        }
        
