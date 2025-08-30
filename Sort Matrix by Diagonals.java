class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;i+j<n;j++)
            {
               list.add(grid[j+i][j]);
            }
            list.sort(Collections.reverseOrder());
            for(int j=0;i+j<n;j++)
            {
                grid[j+i][j]=list.get(j);
            }
        }

         for(int j=1;j<n;j++)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i+j<n;i++)
            {
               list.add(grid[i][i+j]);
            }
            Collections.sort(list);
            for(int i=0;i+j<n;i++)
            {
                grid[i][i+j]=list.get(i);
            }
        }
        return grid;
    }
}
