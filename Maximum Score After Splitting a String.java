class Solution {
    public int maxScore(String s) {
      
        int r=0;
       for(int i=0;i<s.length()-1;i++)
       {
        int count =0;
        for(int j =0;j<=i;j++)
        {
            if(s.charAt(j)=='0')
            {
                count++;
            }
        }
        for(int j=i+1;j<s.length();j++)
        {
                    if(s.charAt(j)=='1')
            {
                count++;
            }
        }
        r=Math.max(r,count);
       }
             
       return r;
    }
}
