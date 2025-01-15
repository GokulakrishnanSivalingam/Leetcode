class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
    
            for(int j=0,i=m;j<n;j++)
            {
              a[i]=b[j];
              i++;     
            }

    
            Arrays.sort(a);
        
        
    }
}
