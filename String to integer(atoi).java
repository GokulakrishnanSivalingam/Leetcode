class Solution {
    public int myAtoi(String s) {
        int  max= 2147483647, min= -2147483648;
        int i = 0, n = s.length(), ss = 1, r= 0;
        
        
        while (i < n && s.charAt(i) == ' ') i++;
        
        
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            ss = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        
        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            if (r > (max- digit) / 10) {
                return ss == 1 ? max : min;
            }
            r = r * 10 + digit;
            i++;
        }
        
        return ss* r;
    }
}
