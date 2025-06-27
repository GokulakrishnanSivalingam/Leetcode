class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
    String str3=str1+str2;
            if(!str3.equals(str2+str1))
            {
              return "";
              
            }

       int n3=gcd(n1,n2);
        
        return str1.substring(0,n3);
    }
    private int  gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}
