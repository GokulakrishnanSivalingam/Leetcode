class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n1:nums)
        {
            map.put(n1,map.getOrDefault(n1,0)+1);
        }
        int max=0;
        for(int n1:nums)
        {
            if(map.get(n1)>max)
            {
                max=map.get(n1);
            }
        }
        int c=0;
        for(int n1:map.keySet())
        {
            if(map.get(n1)==max)
            {
                c+=max;
            }
        }
        return c;
    }
}
