class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (r.get(s.charAt(i)) < r.get(s.charAt(i + 1))) {
                res -= r.get(s.charAt(i));
            } else {
                res += r.get(s.charAt(i));
            }
        }

        return res +r.get(s.charAt(s.length() - 1));        
    }
}
