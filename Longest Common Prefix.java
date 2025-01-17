class Solution {
    public String longestCommonPrefix(String[] strs) {
             if (strs == null || strs.length == 0) {
            return "";
        }
        String pre=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(pre))
            {
                pre=pre.substring(0,pre.length()-1);
                if(pre.isEmpty())
                {
                    return "";
                }
            }
        }
        return pre;
        
    }
}
