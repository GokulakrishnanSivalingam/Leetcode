class Solution {
    public int maxChunksToSorted(int[] arr) {
       int r=0,c=0 ,e=0;
       for(int i=0;i<arr.length;i++)
       {
        r+=arr[i];
        e+=i;
        if(r==e)
        {
            c++;
        }
       }
       return c;
    }
}
