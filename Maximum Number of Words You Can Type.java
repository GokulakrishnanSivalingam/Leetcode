class Solution {
    public int canBeTypedWords(String text, String bl) {
        String arr[]=text.split(" ");
        int c=0;
        for(String b:arr)
        {
            int f=0;
            for(int i=0;i<b.length();i++){
                
                for(int j=0;j<bl.length();j++)
                {
                    if(b.charAt(i)==bl.charAt(j))
                    {
                           f=1;
                    }

                }
                
            }
            if(f==0)
                {
                    c++;
                }
        }
        return c;
    }
}
