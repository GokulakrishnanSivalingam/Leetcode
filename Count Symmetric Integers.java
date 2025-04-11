class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            String str=Integer.toString(i);
            int n=str.length();
            if(n%2!=0) continue;
            int h=n/2;
            int r=0,l=0;
            for(int j=0;j<h;j++)
            {
                r+=str.charAt(j)-'0';
            }
             for(int j=h;j<n;j++)
            {
                l+=str.charAt(j)-'0';
            }
            if(l==r)
            {
                c++;
            }
            
        }

      
        return c;
    }
}
