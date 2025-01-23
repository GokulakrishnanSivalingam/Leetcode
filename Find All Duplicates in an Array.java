class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList();
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int num:nums)
        {
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        for(int x:hash.keySet())
        {
            if(hash.get(x)==2)
            {
                 ans.add(x);
            }
        
        }
    
            return ans;
    }
}
