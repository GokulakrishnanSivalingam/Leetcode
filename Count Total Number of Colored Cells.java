class Solution {
    public long coloredCells(int n) {
         long c=1 + 2L * (n - 1) * n;
         return c;
    }
}
