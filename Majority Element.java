class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int c=0;
        int m=nums.length/2;
        for(int num:nums)
        {
 hash.put(num,hash.getOrDefault(num,0)+1);
        }
        for(int a:hash.keySet())
        {
             if(hash.get(a)>m)
             {  
            return a;
             }

            
        }
        return 1;
       
    }
}
