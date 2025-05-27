class Solution {
    public int minPathSum(int[][] a) {
        int r=a.length;
        int c=a[0].length;
        for(int i=1;i<r;i++)
        {
            a[i][0]+=a[i-1][0];
        }
        for(int j=1;j<c;j++)
        {
            a[0][j]+=a[0][j-1];
        }
        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                a[i][j]+=Math.min(a[i][j-1],a[i-1][j]);
            }
        }
        return a[r-1][c-1];
        
    }
}
