class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer , Integer>  hash =new HashMap<>();
    
        for(int num :nums)
        {
hash.put(num,hash.getOrDefault(num,0)+1);

        }
        for(int x:nums)
        {
            if(hash.get(x)>1)
{
    return x;
}
        }
return -1;
}
}
