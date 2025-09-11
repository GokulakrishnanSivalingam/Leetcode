class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> avs=new ArrayList<>();
        if (s.length() == 0) {
    return s;   
}

        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
           {
              avs.add(s.charAt(i));
           }
        }

           char b[]=new char[avs.size()];
           for(int i=0;i<avs.size();i++)
           {
            b[i]=avs.get(i);
           }
           Arrays.sort(b);
           int k=0;
           StringBuilder sb=new StringBuilder(s);
    for(int i=0;i<s.length();i++)
        {
            if(k>=b.length)break;
            
           
           if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
           {
              sb.setCharAt(i,b[k]);
              k++;
           }

        }
        return sb.toString();
    }
}
