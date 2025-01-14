class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        
        int C[]=new int[n];
        for(int i=0;i<n;i++)
        {
          int c=0;
            for(int j=0;j<i+1;j++)
            {
               for(int k=0;k<i+1;k++)
               {
                        if(A[j]==B[k])
                        {
                             c++;
                        }
               }  
            }
            C[i]=c;
        }
        return C;

    }
}
