class Solution {
    public int findNumbers(int[] nums) {
        int k=0;
        for(int n:nums )
        {
            int c=0;
            while(n>0)
            {
               int p=n%10;
                c++;
               n=n/10;
            }
            if(c%2==0)
            {
                 k++;
            }
           
        }
        return k;
        
    }
}
