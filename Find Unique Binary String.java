class Solution {
    public String findDifferentBinaryString(String[] nums) {
  
    StringBuilder avs=new StringBuilder();
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i].charAt(i)=='0')
        {
            avs.append('1');
        }
        else
        {
            avs.append('0');
        }
    }
        return avs.toString();
    }
}
