class Solution {
    public int bitwiseComplement(int n) {
        if (n==0)
        {
            return 1;
        }
        
      String  r="";
    
      while(n>0)
      {
        if(n%2==1)
        {
            r+="1";
        }
        else{
            r+='0';
        }
        n/=2;
      }
 StringBuilder sf = new StringBuilder(r);
      String r1=sf.reverse().toString();
      int num=0;
       for (int i = 0; i < r1.length(); i++) {
            if (r1.charAt(i) == '0') {
                num += Math.pow(2, r1.length() - 1 - i);
            }
        }
        return num;

    } 
}
