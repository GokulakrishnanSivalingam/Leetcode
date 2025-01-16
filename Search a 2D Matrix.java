class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int f=0;
        for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[0].length;j++)
          {
            if(matrix[i][j]==target)
            {
                f=1;
            }
          }
        }
        if(f==1)
        {
            return true;
        }
        return false;
    }
}
