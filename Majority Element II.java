class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer,Integer>hash=new HashMap<>();
        int c=0;
        int m=nums.length/3;
    List<Integer> r=new ArrayList<>();
        for(int num:nums)
        {
 hash.put(num,hash.getOrDefault(num,0)+1);
        }
        for(int a:hash.keySet())
        {
             if(hash.get(a)>m)
             {  
             r.add(a);
             }

            
        }
        return r;
        
    }
}
