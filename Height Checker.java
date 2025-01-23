class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int num[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            num[i]=heights[i];
        }

    
       Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(num[i]!=heights[i])
            {
                c++;
            }
        }
        return c;
    }

}
