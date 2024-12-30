class Solution {
    public int reverse(int x) {
        int rr = 0;
        
        while (x != 0) {
            int d = x % 10;

            if (rr > Integer.MAX_VALUE / 10 || (rr == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (rr < Integer.MIN_VALUE / 10 || (rr == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            rr = rr * 10 + d;
            x /= 10;
        }

        return rr;
    }
}
