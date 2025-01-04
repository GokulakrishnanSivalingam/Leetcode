class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int n:nums)
        {
            hash.put(n,hash.getOrDefault(n,0)+1);
        }
        for(int n:nums)
        {
            if(hash.get(n)>1)
            {
                return true;
            }
        }
        return false;
    }
}
