class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> hash=new HashMap<>();
        for(int num:nums)
        {
            if(k<num)
            {
                hash.put(num,hash.getOrDefault(num,0)+1);
            }
            else if(k>num)
            {
                return -1;
            }
        }
        return hash.size();
    }
}
