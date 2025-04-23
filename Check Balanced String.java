class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
          int nums = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(i%2==0)
            {
                s1+=nums;
            }
            else
            {
                s2+=nums;
            }
        }
       return s1==s2; 
    }
}
